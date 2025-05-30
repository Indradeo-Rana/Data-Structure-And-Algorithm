import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
    static class Edge {
    
        int src;
        int dest;

        public Edge(int s, int d){
            this.dest=d;
            this.src=s;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[],int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] =new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;
            
                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e =graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] =new ArrayList[v];
        createGraph(graph);

        // bfs(graph, v);

        boolean vis[] =new boolean[v];
        for (int i = 0; i < v; i++) {
            if(vis[i]==false)
            // bfsForAll(graph , v,vis,i); // if graph contains sub-graphs
            System.out.println("\n");
            dfs(graph, i, vis);
        }

        // boolean visited [] = new boolean[v];
        // dfs(graph, 0, visited); // DFS traversal starting from vertex 0
    }
    public static void bfsForAll(ArrayList<Edge> graph[],int v,boolean vis[],int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;
            
                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e =graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> graph[], int cur, boolean vis[]) {
        System.out.print(cur + " ");
        vis[cur] = true;
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (vis[e.dest]==false) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}
