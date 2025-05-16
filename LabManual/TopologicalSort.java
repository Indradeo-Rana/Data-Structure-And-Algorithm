import java.util.*;

class TopologicalSort {
    public static void topologicalSort(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);
            for (int neighbor : adj.get(node)) {
                if (--inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        if (topoOrder.size() == V) {
            System.out.println("Topological Order: " + topoOrder);
        } else {
            System.out.println("Cycle detected, topological sorting not possible.");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topologicalSort(V, adj);
    }
}
