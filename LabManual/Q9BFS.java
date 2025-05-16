import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q9BFS {
    
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
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
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[] =new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if(vis[i]==false)
            bfs(graph,vis,v,i);
        }
    }
    public static void bfs(ArrayList<Edge> graph[], boolean vis[], int v, int start){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int cur=q.remove();
            if(vis[cur]==false)
            System.out.println(cur+" ");
            for (int i = 0; i < graph[cur].size(); i++) {
                Edge e =graph[cur].get(i);
                q.add(e.dest);
            }
        }
    }
}
