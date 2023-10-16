import java.util.ArrayList;

class Graph{
    static class Edge{
        int src;
        int des;
        int weight;
        Edge(int src,int des,int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int numberOfVertices = 8;
        ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];
        int[] visited = new int[numberOfVertices];
        for(int i=0;i<numberOfVertices;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph = buildGraph(numberOfVertices);
        //System.out.println(hasPath(graph, 0, 6, visited));
        printAllPaths(graph, 0, 7, visited,0+"");
    }
    public static ArrayList<Edge>[] buildGraph(int numberOfVertices){

        ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];
        for(int i=0;i<numberOfVertices;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 10));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));

        graph[2].add(new Edge(2, 3, 10));
        graph[2].add(new Edge(2, 1, 10));

        graph[3].add(new Edge(3, 5, 10));
        graph[3].add(new Edge(3, 0, 10));
        graph[3].add(new Edge(3, 2, 10));

        graph[4].add(new Edge(4, 5, 10));
        graph[4].add(new Edge(4, 6, 10));

        graph[5].add(new Edge(5, 4, 10));
        graph[5].add(new Edge(5, 7, 10));
        graph[5].add(new Edge(5, 3, 10));

        graph[6].add(new Edge(6, 4, 10));
        graph[6].add(new Edge(6, 7, 10));

        graph[7].add(new Edge(7, 6, 10));
        graph[7].add(new Edge(7, 5, 10));

        return graph;
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, int[] visited){ 
        if(src == des){
            return true;
        }
        visited[src] = 1;
        for(Edge edge : graph[src]){
            if(visited[edge.des] == 0){
                boolean hasNbrPath = hasPath(graph,edge.des, des, visited);
                if(hasNbrPath){
                    return true;
                }
            }
        }
        return false;
    }


    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int des, int[] visited, String asf){
         if(src == des){
            System.out.println(asf);
            return;
        }
        visited[src] = 1;
        for(Edge edge : graph[src]){
            if(visited[edge.des] == 0){
                printAllPaths(graph,edge.des, des, visited,asf+"->"+edge.des);
            }
        }
        visited[src] = 0;
    }
}


