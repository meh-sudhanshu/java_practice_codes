class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,3},{3,4},{4,5},{4,7},{5,6},{7,6},{2,3}};
        int n = 8;
        int[][] graph = buildGraph(edges,n);
        //printGraph(graph);
        int[] visited = new int[n];
        int src = 1;
        int des = 7;
        visited[src] = 1;
        //boolean ans = isPathExist(graph,src,des,visited);
        //System.out.println(ans);
        printAllPaths(graph,src,des,visited,src+"");
    }

    private static void printAllPaths(int[][] graph, int src, int des,int[] visited, String psf) {
        if(src == des){
            System.out.println(psf);
            return;
        }
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(graph[src][i] == 1){
                if(visited[i] == 0){
                    visited[i] = 1;
                    printAllPaths(graph,i, des, visited, psf+"->"+i);
                    visited[i] = 0;
                }
            }
        }
    }

    private static boolean isPathExist(int[][] graph, int src, int des,int[] visited) {
        if(src == des) return true;
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(nbrs[i] == 1){
              if(visited[i] == 0){
                visited[i] = 1;
                boolean ans =  isPathExist(graph,i , des,visited);
                if(ans == true) return true;
              }
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