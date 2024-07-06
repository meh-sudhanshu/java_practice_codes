import java.util.ArrayDeque;
import java.util.ArrayList;

class GraphUsingArrayList {
    static class Edge {
        int src, des, wt;

        Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    static class Pair {
        int src;
        String psf;

        Pair(int src, String psf) {
            this.src = src;
            this.psf = psf;
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {1,2,5}, {0,1,10},
        
        { 3, 2, 3 }, { 0, 2, 3 }, { 1, 3, 4 }, { 6, 5, 6 }, { 6, 4, 7 } };
        int n = 7;
        ArrayList<Edge>[] graph = buildGraph(edges, n);

        ArrayList<String> allComponents =   getAllComponents(graph,n);
        System.out.println(allComponents);
        // bfs(graph,n,0);
        // boolean ans = false;
        // for (int i = 0; i < n; i++) {
        //         ans = isCyclic(graph, n, i);
        //         if (ans == true){
        //             break;
        //         }
        // }

        // System.out.println(ans);
        // boolean ans = isCyclic(graph,n);
        // int src = 0, des = 6;
        // int[] visited = new int[n];
        // boolean ans = hasPath(graph,src,des, visited,true);
        // System.out.println(ans);
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n;j++){
        // visited[i] = 1;
        // ArrayList<String> allPath = new ArrayList<>();
        // allPath = getAllPath(graph,i,j,visited,""+i,0,allPath);
        // System.out.println(allPath);
        // }
        // }
        // printGraph(graph);

        // boolean ans = isCyclic(graph,n);
        // System.out.println(ans);

    }
    // private static boolean isCyclic(ArrayList<Edge>[] graph,int n) {
    // int[] visited = new int[n];
    // for(int i=0;i<n;i++){
    // if(hasPath(graph, i, i, visited,false)){
    // return true;
    // }
    // }
    // return false;
    // }
    // private static ArrayList<String>
    // getAllPath(ArrayList<GraphUsingArrayList.Edge>[] graph, int src, int des,
    // int[] visited, String pathSoFar, int costSoFar,ArrayList<String> allPath) {
    // if(src == des){
    // allPath.add(pathSoFar+"->"+src);
    // return null;
    // }
    // ArrayList<Edge> nbrs = graph[src];
    // for(int i=0;i<nbrs.size();i++){
    // int nbr = nbrs.get(i).des;
    // int cost = nbrs.get(i).wt;
    // if(visited[nbr] == 0){
    // visited[nbr] = 1;
    // getAllPath(graph, nbr, des, visited, pathSoFar+"->"+nbr,
    // costSoFar+cost,allPath);
    // visited[nbr] = 0;
    // }
    // }

    private static ArrayList<String> getAllComponents(ArrayList<GraphUsingArrayList.Edge>[] graph, int n) {
        int[] visited = new int[n];
        ArrayList<String> allComponents = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(visited[i] == 0){
                StringBuilder component = new StringBuilder();
                buildComponentInvolvingI(graph,i,visited,component);
                allComponents.add(component.toString());
            }
        }

        return allComponents;
    }

    private static void buildComponentInvolvingI(ArrayList<GraphUsingArrayList.Edge>[] graph, int i, int[] visited,
            StringBuilder component) {
            visited[i] = 1;
            component.append(i);
            ArrayList<Edge> nbrs = graph[i];
            for(Edge edge : nbrs){
                if(visited[edge.des] == 0){
                    buildComponentInvolvingI(graph, edge.des, visited, component);
                }
            }
                
    }

    private static boolean isCyclic(ArrayList<GraphUsingArrayList.Edge>[] graph, int n, int src) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, src + ""));
        int[] visited = new int[n];
        while (queue.size() > 0) {
            Pair removedPair = queue.poll();
            if(visited[removedPair.src] == 1){
                return true;
            }
            visited[removedPair.src] = 1;
            // System.out.println(src+ "-->" + removedPair.psf);
            ArrayList<Edge> nbrs = graph[removedPair.src];
            for (Edge edge : nbrs) {
                int nbr = edge.des;
                if(visited[nbr] == 0){
                    queue.add(new Pair(nbr, removedPair.psf + "->" + nbr));
                }
                
            }
        }

        return false;
    }

    private static void bfs(ArrayList<GraphUsingArrayList.Edge>[] graph, int n, int src) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, src + ""));
        int[] visited = new int[n];
        while (queue.size() > 0) {
            Pair removedPair = queue.poll();
            visited[removedPair.src] = 1;
            System.out.println(src + "-->" + removedPair.psf);
            ArrayList<Edge> nbrs = graph[removedPair.src];
            for (Edge edge : nbrs) {
                int nbr = edge.des;
                if (visited[nbr] == 1) {
                    continue;
                }
                queue.add(new Pair(nbr, removedPair.psf + "->" + nbr));
            }
        }
    }

    // return allPath;
    // }
    // private static boolean hasPath(ArrayList<Edge>[] graph,
    // int src, int des, int[] visited, boolean flag) {
    // if((src == des) && (flag == true)){
    // return true;
    // }
    // ArrayList<Edge> nbrs = graph[src];
    // for(int i=0;i<nbrs.size();i++){
    // int nbr = nbrs.get(i).des;
    // if(visited[nbr] == 0){
    // visited[nbr] = 1;
    // boolean ans = hasPath(graph, nbr, des,visited, true);
    // if(ans == true) return true;
    // }
    // }
    // return false;
    // }
    // private static void printGraph(ArrayList<GraphUsingArrayList.Edge>[] graph) {
    // for(int i=0;i<graph.length;i++){
    // for(int j=0; j< graph[i].size();j++){
    // Edge currEdge = graph[i].get(j);
    // System.out.print(currEdge.src+"->"+currEdge.des+"->"+currEdge.wt+" ");
    // }
    // System.out.println();
    // }
    // }
    private static ArrayList<GraphUsingArrayList.Edge>[] buildGraph(int[][] edges, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int src = edge[0];
            int des = edge[1];
            int wt = edge[2];
            Edge edge1 = new Edge(src, des, wt);
            Edge edge2 = new Edge(des, src, wt);
            graph[src].add(edge1);
            graph[des].add(edge2);
        }
        return graph;
    }
}