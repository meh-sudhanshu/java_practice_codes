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

    public static void main(String[] args) {
        int edges[][] = { { 0, 1, 2 },
                { 2, 3, 4 }, { 4, 6, 7 }, { 4, 5, 8 }, { 6, 5, 9 } };
        int n = 7;
        ArrayList<Edge>[] graph = buildGraph(edges, n);
        // printGraph(graph);
        // int src=0, des = 6;
        // int[] visited = new int[n];
        // visited[src] = 1;
        // boolean ans = hasPath(graph,src,des,visited);
        // System.out.println(ans);
        int[] visited = new int[n];
        ArrayList<String> allComponents = getAllComponents(graph, n,visited);
        System.out.println(allComponents);

    }

    private static ArrayList<String> getAllComponents(ArrayList<Edge>[] graph, int n,int[] visited) {
        ArrayList<String> allComponents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                String component = getComponent(i, graph, visited,i+"");
                allComponents.add(component);
            }
        }
        return allComponents;
    }

    private static String getComponent(int i, ArrayList<Graph.Edge>[] graph, int[] visited, String csf) {
        ArrayList<Edge> nbrs = graph[i];
        for(int j=0;j<nbrs.size();j++){
            Edge currentNbr = nbrs.get(j);
            visited[currentNbr.node] = 1;
            getComponent(currentNbr.node, graph, visited, csf+currentNbr.node);
        }
        return csf; 
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