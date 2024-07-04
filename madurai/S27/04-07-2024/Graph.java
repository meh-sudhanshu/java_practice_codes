import java.util.ArrayList;

class Graph{
    static class Edge{
        int node;
        int nbr;
        int wt;
        Edge(int node, int nbr, int wt){
            this.node = node;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        int edges[][] = { { 0, 1, 2 }, {0,2,3},{1,3,5,},{1,4,6},
                        {2,3,4},{4,6,7},{4,5,8},{6,5,9}};
        int n = 7;
        ArrayList<Edge>[] graph = buildGraph(edges,n);
        printGraph(graph);
    }
    private static void printGraph(ArrayList<Graph.Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            ArrayList<Edge> nbrs = graph[i];
            for(int j=0;j<nbrs.size();j++){
                Edge currentNbr = nbrs.get(j);
                System.out.print(currentNbr.node+"->"+currentNbr.nbr+"->"+currentNbr.wt+"   ");
            }
            System.out.println();
        }

    }
    private static ArrayList<Graph.Edge>[] buildGraph(int[][] edges, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int node = edge[0];
            int nbr = edge[1];
            int wt = edge[2];
            Edge edge1 = new Edge(node, nbr, wt);
            Edge edge2 = new Edge(nbr,node, wt);
            graph[node].add(edge1);
            graph[nbr].add(edge2);
        }
        return graph;
    }
}