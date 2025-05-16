import java.util.*;

class Q7 {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;
        
        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static class DisjointSet {
        int[] parent, rank;

        DisjointSet(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int v) {
            if (parent[v] != v) parent[v] = find(parent[v]);
            return parent[v];
        }

        void union(int u, int v) {
            int rootU = find(u), rootV = find(v);
            if (rootU != rootV) {
                if (rank[rootU] > rank[rootV]) parent[rootV] = rootU;
                else if (rank[rootU] < rank[rootV]) parent[rootU] = rootV;
                else { parent[rootV] = rootU; rank[rootU]++; }
            }
        }
    }

    static int kruskalMST(int V, List<Edge> edges) {
        Collections.sort(edges);
        DisjointSet ds = new DisjointSet(V);
        int minCost = 0, count = 0;

        for (Edge e : edges) {
            if (ds.find(e.src) != ds.find(e.dest)) {
                ds.union(e.src, e.dest);
                minCost += e.weight;
                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
                if (++count == V - 1) break;  // Stop early if MST is formed
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        int V = 4;
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 10), new Edge(0, 2, 6), 
            new Edge(0, 3, 5), new Edge(1, 3, 15), 
            new Edge(2, 3, 4)
        );

        System.out.println("Edges in MST:");
        int minCost = kruskalMST(V, edges);
        System.out.println("Minimum Cost of Spanning Tree: " + minCost);
    }
}
