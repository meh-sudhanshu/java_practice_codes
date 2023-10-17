package graphs;

import java.util.ArrayList;

public class AdjacencyList {
    static class Edge{
        int src;
        int nbr;
        int weight;

        public Edge(int src, int nbr, int weight) {
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "src=" + src +
                    ", nbr=" + nbr +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args) {
        int numberOfVertices = 5;
        ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];
        graph = buildGraph(numberOfVertices);
        printGraph(graph);
    }

    public static void printGraph(ArrayList<Edge>[] graph){
        for(ArrayList<Edge> edges: graph){
            for(Edge edge : edges){
                System.out.print(edge.toString()+" ");
            }

            System.out.println();
        }
    }
    public static ArrayList<Edge>[] buildGraph(int numberOfVertices){
        ArrayList<Edge>[] graph = new ArrayList[numberOfVertices];

        for(int i=0;i<numberOfVertices;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,-1));

        graph[1].add(new Edge(1,0,-1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,4,5));
        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,2,2));
        graph[3].add(new Edge(3,4,7));

        graph[4].add(new Edge(2,4,5));
        graph[4].add(new Edge(2,3,2));



        return graph;
    }
}
