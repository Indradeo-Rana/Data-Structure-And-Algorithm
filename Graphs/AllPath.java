
import java.util.*;
public class AllPath {
    static class Edge {
        int scr;
        int dest;

        public Edge(int s, int d){
            this.dest=d;
            this.scr=s;
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
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    } 

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int cur){
        System.out.print(cur+" ");
        vis[cur]=true;
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e=graph[cur].get(i);
            if(vis[e.dest]==false)
            dfs(graph,vis,e.dest);
        }
    }

    public static void PrintPath(ArrayList<Edge> graph[], boolean vis[], int cur, String path, int tar){
        if(cur==tar){
            System.out.println(path+" ");
            return;
        }
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e =graph[cur].get(i);
            if(!vis[e.dest]){
                vis[cur]=true;
                PrintPath(graph,vis,e.dest,path+e.dest,tar);
                vis[cur]=false;
            }
        }
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src=0, tar=5;
        boolean vis[]= new boolean[v];
        // for (int i = 0; i < v; i++) {
        //     if(vis[i]==false)
        //     dfs(graph, vis,i);
        // }
        PrintPath( graph,vis,src,"0",tar);
    }
}
