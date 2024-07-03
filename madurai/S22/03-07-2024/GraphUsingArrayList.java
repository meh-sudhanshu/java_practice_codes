import java.util.ArrayList;

class GraphUsingArrayList{
    static class Edge{
        int src,des,wt;
        Edge(int src, int des, int wt){
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        int[][] edges ={{0,1,8},{2,0,-1},{3,2,3},{1,3,2},{1,4,9}
                            ,{4,5,5},{6,5,6},{6,4,7}};
        int n = 7;
        ArrayList<Edge>[] graph =    buildGraph(edges, n);
        printGraph(graph);                            
    }
    private static void printGraph(ArrayList<GraphUsingArrayList.Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            for(int j=0; j< graph[i].size();j++){
                Edge currEdge = graph[i].get(j);
                System.out.print(currEdge.src+"->"+currEdge.des+"->"+currEdge.wt+" ");
            }
            System.out.println();
        }
    }
    private static ArrayList<GraphUsingArrayList.Edge>[] buildGraph(int[][] edges, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            Edge edge1 = new Edge(src, des, wt);
            Edge edge2 = new Edge(des, src, wt);
            graph[src].add(edge1);
            graph[des].add(edge2);
        }
        return graph;
    }
}