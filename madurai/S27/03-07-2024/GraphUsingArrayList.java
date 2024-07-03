import java.util.ArrayList;
import java.util.Arrays;

class GraphUsingArrayList{

    static class Edge{
        int src;
        int des;
        int wt;
        Edge(int src,int des, int wt){
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,2,4},{1,3,-1},{2,3,3},{3,4,5},{4,5,5},
                            {4,6,-1},{6,5,-3}};
        int n = 7;
        
        ArrayList<Edge>[] graph = buildGraph(edges,n);
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.print(graph[i].get(j).src+"->"+graph[i].get(j).des+"->"+graph[i].get(j).wt+" , ");
            }
            System.out.println();
        }
                
    }
    private static ArrayList<Edge>[] buildGraph(int[][] edges, int n){
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            
            Edge newEdge = new Edge(src, des, wt);
            Edge reverseEdge = new Edge(des, src, wt);
            graph[src].add(newEdge);
            graph[des].add(reverseEdge);

        }
        return graph;
    }
}