import java.util.Arrays;

public class WeightedGraph {
    public static void main(String[] args) {
        //unidirectional graph
        int n = 7;
        int[][] edges = {{0,1,3}, {0,3,4},{1,4,8},{3,2,3},{1,2,2},{4,5,5},{4,6,2}};
        int[][] graph = buildGraph(edges,n);
        printGraph(graph);
        int src = 0,des = 6;
        String psf = src+"";
        int[] visited = new int[n];
        String[] ans = new String[2];
        ans[0] = "-1";
        ans[1] = "-1";
        int cost = 0;
        ans = getMinWeightPath(graph,src,des,visited,psf,ans,cost);
        System.out.println(Arrays.toString(ans));
    }
    private static void printGraph(int[][] graph){
        for(int[] row : graph){
            for(int e : row){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
    private static String[] getMinWeightPath(int[][] graph, int src, int des, int[] visited, String psf,String[] ans,int csf) {
        if(src == des){
            if(ans[0].equals("-1") && ans[1].equals("-1")){
                //System.out.println("triggered");
                ans[0] = csf+"";
                ans[1]=psf+"";
            }else{
                //System.out.println("trigger4444ed");
                if(csf < Integer.parseInt(ans[0])){
                    ans[0] = csf+"";
                    ans[1] = psf+"";
                }
            }
            //System.out.println(Arrays.toString(ans));
        }
        int[] nbrs = graph[src];
        for(int i=0;i<nbrs.length;i++){
            if(graph[src][i] != 0){
                if(visited[i] == 0){
                    visited[i] = 1;
                    getMinWeightPath(graph, i, des, visited, psf+"->"+i, ans, csf+graph[src][i]);
                    visited[i] = 0;
                }
            }
        }

        return ans;

    }

    private static int[][] buildGraph(int[][] edges,int n) {
        int[][] graph = new int[n][n];
        for(int[] edge : edges){
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            graph[src][des] = wt;
            graph[des][src] = wt;
        }
        return graph;
    }
}
