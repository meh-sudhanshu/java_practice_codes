import java.util.ArrayList;
import java.util.List;

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
        String pathSorFar = src+"";
        ArrayList<String> allPaths = new ArrayList<>();
        int[] visited = new int[n];
        visited[src] = 1;
        allPaths = getAllPaths(graph,src,des,pathSorFar,allPaths,visited);
        System.out.println(allPaths);
        // int minCost = getMinimumCost(graph,src,des);
        // System.out.println(minCost);
    }

    // private static int getMinimumCost(int[][] graph, int src, int des) {
        
    // }

    private static ArrayList<String> getAllPaths(int[][] graph, int src, 
                    int des,String psf,ArrayList<String> allPaths,int[] visited) {
        if(des == src){
            allPaths.add(psf);
            return null;
        }
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(graph[src][i] != 0){
                if(visited[i] == 0){
                    visited[i] = 1;
                    getAllPaths(graph, i, des, psf+"->"+i, allPaths, visited);
                    visited[i] = 0;
                }
            }
        }

        return allPaths;
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