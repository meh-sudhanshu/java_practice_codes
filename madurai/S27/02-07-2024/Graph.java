class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1,5},{0,6,2},{0,2,3},
                        {2,3,9},{3,4,2},{6,9,1},
                        {5,7,3},{5,8,6},{4,9,8}
            };
        int n = 10;
        int[][] graph = buildGraph(edges,n);
        int src = 2;
        int des = 9;
        int minCost = getMinimumCost(graph,src,des);
        System.out.println(minCost);
    }

    private static int getMinimumCost(int[][] graph, int src, int des) {
        
    }

    private static int[][] buildGraph(int[][] edges, int n) {
        int[][] graph = new int[n][n];
        for(int[] edge : edges ){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            graph[src][des] = wt;
            graph[des][src] = wt;
        }

        return graph;
    }
}