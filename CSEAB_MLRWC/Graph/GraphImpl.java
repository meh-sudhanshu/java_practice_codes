

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Edge{
    int src, des, cost;
    Edge(int src, int des, int cost){
        this.src = src;
        this.des = des;
        this.cost = cost;
    }
    

}

class DijkstraData implements Comparable<DijkstraData>{
  
    int des;
    String psf;
    int cost;

    DijkstraData(int des, String psf, int cost){
       
        this.des = des;
        this.psf = psf;
        this.cost = cost;
    }
    @Override
    public int compareTo(DijkstraData data){
        return Integer.compare(cost, data.cost);
    }

}



class BfsData{
    int nodeLabel;
    String psf;
    BfsData(int nodeLabel, String psf){
        this.nodeLabel = nodeLabel;
        this.psf = psf;
    }
}
public class GraphImpl {

    static String largestPath = "";
    static String shortestPath = "";
    static ArrayList<String> allShortestPath = new ArrayList<>();
    static int minCost = Integer.MAX_VALUE;

    public static ArrayList<Edge>[] buildGraph(int[][] edges,int n){
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i = 0; i< n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int src = edge[0];
            int des =edge[1];
            int cost = edge[2];
            Edge currEdge1 = new Edge(src, des,cost);
            Edge currEdge2 = new Edge(des, src,cost);
            graph[src].add(currEdge1);
            graph[des].add(currEdge2);
        }
        return graph;
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des,int[] visited){
        if(src == des) return true;
        ArrayList<Edge> nbrs = graph[src];
        for(Edge nbr : nbrs){
            int currNbr = nbr.des;
            if(visited[currNbr] == 0){
                visited[currNbr] = 1;
                boolean ans = hasPath(graph, currNbr, des,visited);
                if(ans == true) return true;
            }
        }
        return false;
    }
     public static void printAllPath(ArrayList<Edge>[] graph, int src, int des,int[] visited,String psf,int csf){
        if(src == des){
            if(csf < minCost){
                minCost = csf;
            }
            if(psf.length() > largestPath.length()){
                largestPath = psf;
            }
            if(psf.length() <= shortestPath.length() || shortestPath.equals("")){
                shortestPath = psf;
                allShortestPath.add(psf);
            }
            return;
        }
        ArrayList<Edge> nbrs = graph[src];
        for(Edge nbr : nbrs){
            int currNbr = nbr.des;
            int cost =nbr.cost;
            if(visited[currNbr] == 0){
                visited[currNbr] = 1;
                printAllPath(graph, currNbr, des,visited,psf+"->"+currNbr,csf+cost);
                visited[currNbr] = 0;
            }
        }
        
    }
    public static void bfs(ArrayList<Edge>[] graph, int src){
        Queue<BfsData> queue = new LinkedList<>();
        HashMap<Integer,Integer> lookupMap = new HashMap<>();
        queue.add(new BfsData(src, src+""));
        while (queue.size() != 0) {
            BfsData poppedData = queue.poll();
            int nodeLabel = poppedData.nodeLabel;
            String psf = poppedData.psf;
            lookupMap.put(nodeLabel, null);
            System.out.println(nodeLabel+"-----path---"+psf);
            ArrayList<Edge> nbrs = graph[nodeLabel];
            for(Edge edge : nbrs){
                int nbrNode = edge.des;
                if(lookupMap.containsKey(nbrNode) == false){
                    queue.add(new BfsData(nbrNode, psf+nbrNode));
                }
            }

        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        PriorityQueue<DijkstraData> queue = new PriorityQueue<>();
        queue.add(new DijkstraData(src, src+"", 0));
        HashMap<Integer,Integer> lookupMap = new HashMap<>();
        while (queue.size() != 0) {
            DijkstraData data = queue.poll();
            int node = data.des;
            if(lookupMap.containsKey(node) == false){
                lookupMap.put(node, null);
            String psf = data.psf;
            int cost = data.cost;
            System.out.println(node+"----path----"+psf+"--cost--"+cost);
            ArrayList<Edge> nbrs = graph[node];
            for(Edge edge : nbrs){
                int currNbr = edge.des;
                int currCost = edge.cost;
                if(lookupMap.containsKey(currNbr) == false){
                    queue.add(new DijkstraData(currNbr, psf+"->"+currNbr, cost+currCost));
                }
            }
            }

        }
    }
    public static void expand(ArrayList<Edge>[] graph, int i,boolean[] visited, StringBuilder csf){
        visited[i] = true;
        csf.append(i+"->");
        ArrayList<Edge> nbrs = graph[i];
        for(Edge edge : nbrs){
            int nbr = edge.des;
            if(visited[nbr]==false){
                expand(graph, nbr, visited, csf);
            }
        }   
    }
    public static List<String> getConnectedComponents(ArrayList<Edge>[] graph, int n){
        List<String> allComponnets = new ArrayList<>();
        boolean[]  visited = new boolean[n];
        for(int i = 0; i< n; i++){
            if(visited[i] == false){
                StringBuilder currComponent = new StringBuilder();
                expand(graph,i,visited,currComponent);
                allComponnets.add(currComponent.toString());
            }

        }
        return allComponnets;
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1,10},{0,2,5},{1,3,3},{2,3,7},{4,5,34},{4,6,2},{6,7,23},{5,7,11}};
        int n = 8;
        ArrayList<Edge>[] graph = buildGraph(edges,n);
        // int[] visited = new int[n];
        // int src = 0;
        // int des = 5;
        // visited[src] = 1;
        //System.out.println(hasPath(graph, src, des,visited));
        // printAllPath(graph, src, des, visited, src+"",0);
        // System.out.println(largestPath);
        // System.out.println(shortestPath);
        // System.out.println(allShortestPath);
        // System.out.println(minCost);
        //bfs(graph,0);
        //dijkstra(graph, 0);
        System.out.println(getConnectedComponents(graph, n));
    }
}