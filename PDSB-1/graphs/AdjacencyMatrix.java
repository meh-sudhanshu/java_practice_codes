package graphs;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int numberOfVertices = 6;
        int[][] graph = new int[numberOfVertices][numberOfVertices];
        graph = buildGraph(numberOfVertices);
        printGraph(graph);
    }

    public static  void printGraph(int[][] graph){
       for(int i=0;i< graph.length;i++){
           for(int j=0;j<graph[0].length;j++){
               if(graph[i][j] != 0){
                   System.out.println(i+"->"+j+"@ "+graph[i][j]);
               }
           }
       }
    }

    public static int[][] buildGraph(int numberOfVertices){
        int[][] graph = new int[numberOfVertices][numberOfVertices];
        graph[0][1]=8;

        graph[1][2] = 3;
        graph[1][0] = 8;

        graph[2][1] = 3;
        graph[2][3] = 8;
        graph[2][5] = 10;

        graph[3][2] = 8;
        graph[3][4] = 10;

        graph[4][3] = 10;
        graph[4][5] = 5;

        graph[5][4] = 5;
        graph[5][2] = 10;

        return graph;
    }
}
