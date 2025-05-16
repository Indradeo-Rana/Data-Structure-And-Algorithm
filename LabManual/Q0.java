 import java.util.*;

public class Q0 {      //  GraphConnectivityCheck using DFS
    static void dfs(int v, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[v] = true;
        for (int u : graph.get(v)) {
            if (!visited[u]) {
                dfs(u, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;  // Number of vertices
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (Undirected)
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        boolean[] visited = new boolean[V];

        // Start DFS from node 0
        dfs(0, graph, visited);

        // Check if all nodes are visited
        boolean isConnected = true;
        for (boolean b : visited) {
            if (!b) {
                isConnected = false;
                break;
            }
        }

        if (isConnected)
            System.out.println("Graph is Connected");
        else
            System.out.println("Graph is NOT Connected");
    }
}
 
