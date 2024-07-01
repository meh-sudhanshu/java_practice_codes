class Graph{
    static String largestPath = "", smallestPath = "";
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,3},{1,2},{1,4},{2,3},{4,5},{4,7},{5,6},{6,7},{3,7}};
        int n = 8;
        int[][] graph = buildGraph(edges,n);
        //printGraph(graph);
        int src = 3;
        int des = 7;
        int[] visited = new int[n];
        visited[src] = 1;
        printAllPath(graph,src,des,visited,src+"");
        System.out.println(smallestPath+" smallest path");
        System.out.println(largestPath+" largest path");
        //boolean ans = hasPath(graph,src,des,visited);
        //System.out.println(ans);

    }




    private static void printAllPath(int[][] graph, int src, int des, 
                                        int[] visited, String psf) {
        if(src == des){
            System.out.println(psf);
            if(largestPath.equals("") && smallestPath.equals("")){
                largestPath = psf;
                smallestPath = psf;
            }else{
                if(psf.length() < smallestPath.length()){
                    smallestPath = psf;
                }
                if(psf.length() > largestPath.length()){
                    largestPath = psf;
                }
            }
            return;
        }
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(graph[src][i] == 1 && visited[i]==0){
                visited[i] = 1;
                printAllPath(graph,i, des, visited, psf+"->"+i);
                visited[i] = 0;
            }
        }
    }




    private static boolean hasPath(int[][] graph, int src, int des,int[] visited) {
        visited[src] = 1;
        if(src == des) return true;
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(graph[src][i] == 1){
               if(visited[i] == 0){
                    boolean ans = hasPath(graph, i, des,visited);
                    if(ans == true) return true;
               }
            }
        }

        return false;
    }




    private static int[][] buildGraph(int[][] edges,int n) {
       int[][] graph = new int[n][n];
       for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            graph[src][des] = 1;
            graph[des][src] = 1;
       }
       return graph;
    }

    private static void printGraph(int[][] graph) {
        for(int[] row : graph){
            for(int e : row){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}