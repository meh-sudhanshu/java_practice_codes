class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,3},{3,4},{4,5},{4,7},{5,6},{7,6},{2,3}};
        int n = 8;
        int[][] graph = buildGraph(edges,n);
        //printGraph(graph);
        boolean ans = isPathExist(graph,3,7);
        System.out.println(ans);
    }

    private static boolean isPathExist(int[][] graph, int src, int des) {
        if(src == des) return true;
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(nbrs[i] == 1){
               boolean ans =  isPathExist(graph,i , des);
               if(ans == true) return true;
            }
        }
        return false;
    }

    private static void printGraph(int[][] graph) {
        for(int[] row : graph){
            for(int e : row){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }

    private static int[][] buildGraph(int[][] edges, int n) {
        int[][] graph = new int[n][n];
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            graph[src][des] = 1;
            graph[des][src] = 1;
        }
        return graph;
    }
}