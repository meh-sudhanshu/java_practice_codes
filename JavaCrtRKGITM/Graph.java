import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.crypto.spec.DESKeySpec;

class BfsData{
    int cd;
    String psf;
    BfsData(int cd, String psf){
        this.cd = cd;
        this.psf = psf;
    }
}

class DijkstraData implements Comparable<DijkstraData>{
    int cd;
    String psf;
    int csf;
    DijkstraData(int cd, String psf, int csf){
        this.cd = cd;
        this.psf = psf;
        this.csf = csf;
    }
    
    @Override
    public int compareTo(DijkstraData o) {
        // TODO Auto-generated method stub
        return Integer.compare(o.csf, this.csf);
    }
}


class Graph{
    static Integer minCost = Integer.MAX_VALUE;
    static Integer maxCost = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[][] edges = {{0,2,2},{1,3,30},
            {4,6,18},{6,7,45},{5,7,23}}
        ;
        int n = 8;
        int[][] graph = buildGraph(edges,n);
        // int[] visited = new int[n];
        // int src = 0;
        // int des = 7;
        // StringBuilder longestPath = new StringBuilder();
        // StringBuilder shortestPath = new StringBuilder();
        // // boolean ans = hasPath(graph,src,des,visited);
        // System.out.println(ans);
        //for(int i = 0;i <n; i++) System.out.print(visited[i]+" ");
        // multiSolver(graph, src, des, visited, src+"",longestPath,shortestPath,0);
        // System.out.println(longestPath);
        // System.out.println(shortestPath);
        // System.out.println(minCost);
        // System.out.println(maxCost);
        //bfs(graph,src,n);
        // String[] data = dijkstra(n,graph, src, des);
        // System.out.println("Path To Min Cost "+data[0]);
        // System.out.println("Cost To Min Cost Path "+data[1]);
        int totalNumberOfComponent = countNumberOfComponent(graph, n);
        System.out.println(totalNumberOfComponent);
    }

    public static int countNumberOfComponent(int[][] graph, int n){
        int[] visited = new int[n];
        int ans = 0;
        List<List<Integer>> all = new ArrayList<>();
        for(int i = 0; i< n; i++){
            if(visited[i] == 0){
                List<Integer> curr = new ArrayList<>();
                curr.add(i);
                expandNode(graph,i,visited,curr);
                if(curr.size() == 1){
                    ans+=1;
                }else{
                    boolean shouldIncrease = true;
                    for(int j = 0; j<curr.size();j++){
                        for(int k = 1;k<curr.size(); k++){
                            if(graph[curr.get(j)][curr.get(k)] == 0){
                                System.out.println(curr.get(j)+" "+curr.get(k));
                                shouldIncrease = false;
                            }
                        }
                    }
                    if(shouldIncrease == true){
                        ans+=1;
                    }
                }
               
                ans+=1;
            }
        }
        System.out.println(all);
        return ans;
    }
    public static void expandNode(int[][] graph, int src, int[] visited,List<Integer> curr){
        visited[src] = 1;
        int[] nbrs = graph[src];
        for(int i = 0; i< nbrs.length; i++){
            if(nbrs[i] != 0 && visited[i] == 0){
                curr.add(i);
                expandNode(graph, i, visited,curr);
            }
        }

    }

    public static String[] dijkstra(int n , int[][] graph, int src, int des){
        PriorityQueue<DijkstraData> queue = new PriorityQueue<DijkstraData>();
        DijkstraData initial = new DijkstraData(src,src+"", 0);
        queue.add(initial);
        int[] visited = new int[n];
        String[] ans = new String[2];
        ans[0] = "";
        while(!queue.isEmpty()){
            DijkstraData obj = queue.poll();
            int cd = obj.cd;
            int csf = obj.csf;
            String psf = obj.psf;
            if(cd == des){
                if(ans[0].length() == 0){
                    ans[0] = psf;
                    ans[1] = csf+"";
                }else{
                    if(csf <Integer.parseInt( ans[1])){
                        ans[0] = psf;
                        ans[1] = csf+"";
                    }
                }
            }
            int[] nbrsArray = graph[cd];
            for(int i = 0; i< nbrsArray.length; i++){
                if(visited[i] == 0 && nbrsArray[i] != 0){
                    DijkstraData curr = new DijkstraData(cd,psf+"->"+i, csf + nbrsArray[i]);
                    queue.add(curr);
                }
            }
            visited[cd] = 1;
        }
        return ans;
    }



    public static void bfs(int[][] graph,int src,int n){
        Queue<BfsData> queue = new LinkedList<>();
        BfsData initialData = new BfsData(src,src+"");
        int[] visited = new int[n];
        queue.add(initialData);
        while (!queue.isEmpty()) {
            BfsData removedData = queue.poll();
            int cd = removedData.cd;
            String psf = removedData.psf;
            visited[cd] = 1;
            System.out.println(cd+"###"+psf);
            int[] nbrsArray = graph[cd];
            for(int i = 0; i< nbrsArray.length; i++){
                if(nbrsArray[i] != 0 && visited[i]== 0){
                    BfsData curr = new BfsData(i,psf+"->"+i);
                    queue.add(curr);
                    //System.out.println("added a new node");
                }
            }
        }
        
    }



     public static void multiSolver(int[][] graph, int src, int des, int[] visited,String psf,
                    StringBuilder longestPath, StringBuilder shortestPath, int csf
                        ){
        if(src == des){
            if(csf < minCost){
                minCost = csf;
            }
            if(csf > maxCost) maxCost = csf;
            System.out.println(psf);
            if(psf.length() > longestPath.length()){
                longestPath.replace(0, longestPath.length(), psf);
            }
            if(psf.length() < shortestPath.length() || shortestPath.length() == 0){
                shortestPath.replace(0, shortestPath.length(), psf);
            }
            return;
        };
        visited[src] = 1;
        int[] nbrsArray = graph[src];
        for(int i = 0; i< nbrsArray.length; i++){
            if(nbrsArray[i] != 0 && visited[i] == 0){
                multiSolver(graph, i, des, visited,psf+"->"+i,longestPath,shortestPath,csf+nbrsArray[i]);
            }
        }
        visited[src] = 0; 
    }










    public static boolean hasPath(int[][] graph, int src, int des, int[] visited){
        if(src == des) return true;
        visited[src] = 1;
        int[] nbrsArray = graph[src];
        for(int i = 0; i< nbrsArray.length; i++){
            if(nbrsArray[i] != 0 && visited[i] == 0){
                if(hasPath(graph, i, des, visited)== true){
                    return true;
                }
            }
        } 
        return false;
    }
    public static int[][] buildGraph(int[][] edges, int n){
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