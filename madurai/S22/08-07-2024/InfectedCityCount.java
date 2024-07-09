public class InfectedCityCount {

    static int count = 0;

    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,0,1},{0,0,1,1,1},{1,0,1,1,1},{1,0,0,0,0},{1,1,0,0,0}};
        int i = 3, j = 0;
        int[][] visited = new int[matrix.length][matrix[0].length];
        expandNode(matrix,i,j,visited);
        System.out.println(count);
    }

    private static void expandNode(int[][] matrix, int i, int j, int[][] visited) {

        if(i<0 || j>=matrix[0].length || i>=matrix.length || j<0 || matrix[i][j] == 0 || visited[i][j] == 1){
            return;
        }
        visited[i][j] = 1;
        InfectedCityCount.count+=1;
        //System.out.println(count);
        expandNode(matrix, i-1, j, visited);
        expandNode(matrix, i+1, j, visited);
        expandNode(matrix, i, j-1, visited);
        expandNode(matrix, i, j+1, visited);
    }
}
