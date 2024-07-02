class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1,3},{1,3,2},{1,4,10},{2,4,6},{2,1,1},{3,2,5},
                            {4,5,9},{4,6,3},{6,5,2}
                            };
        int n = 7;
        int[][] graph = buildGraph(edges,n);
        printGraph(graph);
    }

    private static void printGraph(int[][] graph) {
        for(int[] row : graph){
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static int[][] buildGraph(int[][] edges,int n) {
       int[][] graph = new int[n][n];
       for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            graph[src][des] = wt;
       }

       return graph;
    }
}