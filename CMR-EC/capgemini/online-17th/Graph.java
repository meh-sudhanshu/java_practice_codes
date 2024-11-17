import java.util.Arrays;

public class Graph {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,3},{2,3},{5,6},{5,4},{4,7},{6,7}};
        int n = 8;
        int[][] graph = buildGraph(edges,n);
        //printGraph(graph);
        int src = 0;
        int des = 3;
        int[] visited = new int[n];
        boolean ans = hasPath(graph,src,des,visited);
        System.out.println("is there a path from "+src+" to "+des+"----> "+ans);

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
            graph[src][des] = 1;
            graph[des][src] = 1;
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
