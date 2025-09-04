import java.security.interfaces.EdECKey;
import java.util.ArrayList;

class Edge{
    int src;
    int des;
    int wt;
    Edge(int src, int des, int wt){
        this.src = src;
        this.wt = wt;
        this.des = des;
    }
}

class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1,10},{0,2,5},{1,3,10},{2,3,4},{3,4,10},{4,5,11},
                            {4,6,23},{6,7,34},{5,7,10}
                        };
        int n = 8;
        ArrayList<Edge>[] graph = buildGraph(n,edges);
    }

    private static ArrayList<Edge>[] buildGraph(int n, int[][] edges) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i = 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            Edge currEdge = new Edge(src, des, wt);
            graph[src].add(currEdge);
            graph[des].add(currEdge);
            
        }
        return graph;
    }
    
}