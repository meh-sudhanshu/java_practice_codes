import java.util.ArrayDeque;

public class Graph {
    static class Util{
        int src;
        String psf;
        Util(int src, String psf){
            this.src = src;
            this.psf = psf;
        }
    }
    public static void main(String[] args) {
        int n = 8;
        int[][] graph = {
            {0,1,1,0,0,0,0,0},
            {1,0,0,1,0,0,0,0},
            {1,0,0,1,0,0,0,0},
            {0,1,1,0,1,0,0,0},
            {0,0,0,1,0,1,1,0},
            {0,0,0,0,1,0,0,1},
            {0,0,0,0,1,0,0,1},
            {0,0,0,0,0,1,1,0}
        };
        int[] visited = new int[n];
        ArrayDeque<Util> queue = new ArrayDeque<>();
        int src1 = 0;
        int src2 = 1;
        int src3 = 2;
        queue.add(new Util(src1,src1+""));
        queue.add(new Util(src2,src2+""));
        queue.add(new Util(src3,src3+""));
        visited[src1] = 1;
        visited[src2] = 1;
        visited[src3] = 1;

        while (queue.size() > 0) {
            Util removedNode = queue.removeFirst();
            visited[removedNode.src] = 1;
            System.out.println(removedNode.psf);
            int[] nbrs = graph[removedNode.src];
            for(int i = 0; i< nbrs.length; i++){
                if(nbrs[i] == 1 && visited[i] == 0){
                    queue.add(new Util(i,removedNode.psf+"->"+i));
                }
            }
        }
    }
}
