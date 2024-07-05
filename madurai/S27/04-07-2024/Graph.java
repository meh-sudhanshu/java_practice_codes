import java.util.ArrayDeque;
import java.util.ArrayList;

class Graph {
    static class Edge {
        int node;
        int nbr;
        int wt;

        Edge(int node, int nbr, int wt) {
            this.node = node;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair {
        int src;
        String psf;
        Pair(int src,String psf){
            this.src = src;
            this.psf = psf;
        }
        
    }

    public static void main(String[] args) {
        int edges[][] = { 
                { 2, 3, 4 }, { 4, 5, 8 }, { 6, 5, 9 },{1,3,6}};
        int n = 7;
        ArrayList<Edge>[] graph = buildGraph(edges, n);
        // printGraph(graph);
        // int src=0, des = 6;
        // int[] visited = new int[n];
        // visited[src] = 1;
        // boolean ans = hasPath(graph,src,des,visited);
        // System.out.println(ans);
        getAllComponents(graph, n);
        //bfs(graph,n,0);
        // boolean ans = false;
        // for(int i=0;i<n;i++){
        //     ans = isCyclic(graph,n,i);
        //     if(ans == true){
        //         break;
        //     }
        // }
        // System.out.println(ans);
    }

    private static boolean isCyclic(ArrayList<Graph.Edge>[] graph, int n,int src) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        int[] visited = new int[n];
        queue.add(new Pair(src, src+""));
        while (queue.size() > 0) {
            Pair removedPair = queue.poll();
            if(visited[removedPair.src] == 1){
                return true;
            }
            visited[removedPair.src]  = 1;
            //System.out.println(removedPair.src+"->"+removedPair.psf);
            ArrayList<Edge> nbrs = graph[removedPair.src];
            for(Edge edge : nbrs){
                int nbr = edge.nbr;
                if(visited[nbr] == 0){
                    queue.add(new Pair(nbr,removedPair.psf+nbr));
                }
            }
        }
        return false;
    }

    private static void bfs(ArrayList<Graph.Edge>[] graph, int n,int src) {
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        int[] visited = new int[n];
        queue.add(new Pair(src, src+""));
        while (queue.size() > 0) {
            Pair removedPair = queue.poll();
            if(visited[removedPair.src] == 1){
                continue;
            }
            visited[removedPair.src]  = 1;
            System.out.println(removedPair.src+"->"+removedPair.psf);
            ArrayList<Edge> nbrs = graph[removedPair.src];
            for(Edge edge : nbrs){
                int nbr = edge.nbr;
                if(visited[nbr] == 0){
                    queue.add(new Pair(nbr,removedPair.psf+nbr));
                }
            }
        }
    }

    private static void getAllComponents(ArrayList<Edge>[] graph, int n) {
        ArrayList<String> allComponents = new ArrayList<>();
        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                StringBuilder csf = new StringBuilder();
                getComponent(i, graph, visited,csf);
                allComponents.add(csf.toString());
            }
        }
        System.out.println(allComponents);
    }

    private static void getComponent(int i, ArrayList<Graph.Edge>[] 
                                        graph, int[] visited, StringBuilder csf) {
        csf.append(i);
        visited[i]  = 1;
        ArrayList<Edge> nbrs = graph[i];
        for(int j=0;j<nbrs.size();j++){
            Edge currentNbr = nbrs.get(j);
            if(visited[currentNbr.nbr] == 0){
                getComponent(currentNbr.nbr, graph, visited, csf);
            }
        }
         
    }

    private static boolean hasPath(ArrayList<Graph.Edge>[] graph, int src, int des, int[] visited) {
        if (src == des)
            return true;
        ArrayList<Edge> nbrs = graph[src];

        for (int i = 0; i < nbrs.size(); i++) {
            int currentNbr = nbrs.get(i).nbr;
            if (visited[currentNbr] == 0) {
                visited[currentNbr] = 1;
                boolean ans = hasPath(graph, currentNbr, des, visited);
                if (ans == true) {
                    return true;
                }
            }
        }

        return false;

    }

    private static void printGraph(ArrayList<Graph.Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            ArrayList<Edge> nbrs = graph[i];
            for (int j = 0; j < nbrs.size(); j++) {
                Edge currentNbr = nbrs.get(j);
                System.out.print(currentNbr.node + "->" + currentNbr.nbr + "->" + currentNbr.wt + "   ");
            }
            System.out.println();
        }

    }

    private static ArrayList<Graph.Edge>[] buildGraph(int[][] edges, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int node = edge[0];
            int nbr = edge[1];
            int wt = edge[2];
            Edge edge1 = new Edge(node, nbr, wt);
            Edge edge2 = new Edge(nbr, node, wt);
            graph[node].add(edge1);
            graph[nbr].add(edge2);
        }
        return graph;
    }
}