import java.util.Arrays;

public class Graph {
    static String largestPath = "";
    static String smallestPath = null;
    static int maxCost = Integer.MIN_VALUE;
    static int minCost = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,2,3},{1,3,4},{1,4,2},{2,3,-1},{5,6,1},{5,4,6},{4,7,-3},{6,7,-10}};
        int n = 8;
        int[][] graph = buildGraph(edges,n);
       
        //printGraph(graph);
        int src = 0;
        int des = 5;
        int csf = 0;
        int[] visited = new int[n];
        //boolean ans = hasPath(graph,src,des,visited);
        //System.out.println("is there a path from "+src+" to "+des+"----> "+ans);
        String psf = src+"";
        visited[src] = 1;
        multiSolver(graph,src,des,visited,psf,csf);
        System.out.println(largestPath);
        System.out.println(smallestPath);
        System.out.println(maxCost);
        System.out.println(minCost);
    }

    private static void multiSolver(int[][] graph, int src, int des, int[] visited,String psf,int csf){
        if(src == des){
            if (csf > maxCost) {
                maxCost = csf;
            }
            if (csf < minCost) {
                minCost = csf;
            }
            if(psf.length() > largestPath.length()){
                largestPath = psf;
            }
            if(smallestPath == null){
                smallestPath = psf;
            }else if(psf.length() < smallestPath.length()){
                smallestPath = psf;
            }
            System.out.println(psf);
            return;
        }
        int[] nbrs = graph[src];
        //System.out.println(Arrays.toString(nbrs));
        for(int i=0; i< nbrs.length;i++){
            
            if(nbrs[i] != 0 && visited[i] == 0 ){
                visited[i] = 1;
                //System.out.println("hello before");
                multiSolver(graph, i, des, visited,psf+"->"+i,csf+nbrs[i]);
                visited[i] = 0;
                //System.out.println("hello after");
            }
        }
    }


    private static boolean hasPath(int[][] graph, int src, int des,int[] visited){
        if(src == des){
            return true;
        }
        int[] nbrs = graph[src];
        System.out.println(Arrays.toString(nbrs));
        for(int i=0; i< nbrs.length;i++){
            if(nbrs[i] != 0 && visited[i] == 0 ){
                visited[i] = 1;
                boolean ans = hasPath(graph, i, des,visited);
                if(ans == true){
                    return true;
                }
            }
        }
        return false;
    }


    private static int[][] buildGraph(int[][] edges, int n){
        int[][] graph = new int[n][n];
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            graph[src][des] = edge[2];
            graph[des][src] = edge[2];
        }
        return graph;
    }
    private static void printGraph(int[][] graph){
        for(int[] row : graph){
            for(int data : row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
