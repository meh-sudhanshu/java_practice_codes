import java.util.ArrayList;

class Graph{
    public static void main(String[] args) {
        int[][] edges = {{0,1,3},{1,3,2},{1,4,10},{2,4,6},{2,1,1},{3,2,5},
                            {4,5,9},{4,6,3},{6,5,2}
                            };
        int n = 7;
        int[][] graph = buildGraph(edges,n);
        int src = 0;
        int des = 6;
        String pathSoFar = src+"";
        int[] visited = new int[n];
        visited[src] = 1;
        int csf = 0 ;
        ArrayList<String> allPaths = new ArrayList<>();  
        allPaths = getAllPath(graph,src,des,pathSoFar,visited,allPaths,csf);
        System.out.println(allPaths);
    }

    private static ArrayList<String> getAllPath(int[][] graph, int src, int des, 
                String pathSoFar,int[] visited,ArrayList<String> allPaths,int csf) {
       if(src == des){
            allPaths.add(pathSoFar+"*"+csf);
            return null;
       }
       int[] nbrs = graph[src];
       for(int i=0;i<nbrs.length;i++){
        if(graph[src][i] != 0){
            if(visited[i] == 0){
                visited[i] = 1;
                getAllPath(graph, i, des, pathSoFar+"->"+i, visited, allPaths,csf+graph[src][i]);
                visited[i] = 0;
            }
        }
       }
       return allPaths;
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