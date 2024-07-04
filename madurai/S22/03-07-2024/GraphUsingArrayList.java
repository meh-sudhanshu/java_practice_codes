import java.util.ArrayList;

class GraphUsingArrayList{
    static class Edge{
        int src,des,wt;
        Edge(int src, int des, int wt){
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        int[][] edges ={{0,1,8},{3,2,3}
                            ,{6,5,6},{6,4,7}};
        int n = 7;
        ArrayList<Edge>[] graph =    buildGraph(edges, n);
        int src = 0, des = 6;
        //int[] visited = new int[n];
        //boolean ans = hasPath(graph,src,des, visited,true);
        //System.out.println(ans);
        //ArrayList<String>   allPath = new ArrayList<>();
        //allPath = getAllPath(graph,src,des,visited,""+src,0,allPath);
        //printGraph(graph);               
        //System.out.println(allPath);
        
        boolean ans = isCyclic(graph,n);
        System.out.println(ans);

    }
    private static boolean isCyclic(ArrayList<Edge>[] graph,int n) {
        int[] visited = new int[n];
        for(int i=0;i<n;i++){
            boolean ans = hasPath(graph, i, i, visited,false);
            if(ans == true) return true;
        }
        return false;
    }
    private static ArrayList<String> getAllPath(ArrayList<GraphUsingArrayList.Edge>[] graph, int src, int des,
            int[] visited, String pathSoFar, int costSoFar,ArrayList<String> allPath) {
                if(src == des){
                    allPath.add(pathSoFar+"*"+costSoFar);
                    return null;
                }
                ArrayList<Edge> nbrs = graph[src];
                for(int i=0;i<nbrs.size();i++){
                    int nbr = nbrs.get(i).des;
                    int cost = nbrs.get(i).wt;
                   if(visited[nbr] == 0){
                        visited[nbr] = 1;
                        getAllPath(graph, nbr, des, visited, pathSoFar+"->"+nbr, costSoFar+cost,allPath);
                        visited[nbr] = 0;
                   }
                }

            return allPath;
    }
    private static boolean hasPath(ArrayList<Edge>[] graph, 
                                    int src, int des, int[] visited,boolean flag) {
        if(flag == true &&  src == des){
            return true;
        }
        ArrayList<Edge> nbrs = graph[src];
        for(int i=0;i<nbrs.size();i++){
            int nbr = nbrs.get(i).des;
           if(visited[nbr] == 0){
                visited[nbr] = 1;
                boolean ans = hasPath(graph, nbr, des,visited,true);
                if(ans == true) return true;
           }
        }
        return false;
    }
    private static void printGraph(ArrayList<GraphUsingArrayList.Edge>[] graph) {
        for(int i=0;i<graph.length;i++){
            for(int j=0; j< graph[i].size();j++){
                Edge currEdge = graph[i].get(j);
                System.out.print(currEdge.src+"->"+currEdge.des+"->"+currEdge.wt+" ");
            }
            System.out.println();
        }
    }
    private static ArrayList<GraphUsingArrayList.Edge>[] buildGraph(int[][] edges, int n) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
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