public class NumberOfIsland {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0,0,1},{0,0,0,0,1},{1,1,1,0,1},{0,0,1,0,1},{0,0,1,0,0}};
        int n = 5;
        int[][] visited = new int[n][n];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1 && visited[i][j]==0){
                    expandNode(matrix,i,j,visited,n);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static void expandNode(int[][] matrix, int i, int j, int[][] visited,int n) {
        if(i<0 || i>=n || j<0 || j>=n || matrix[i][j] == 0 || visited[i][j] == 1){
            return;
        }
        visited[i][j] = 1;
        expandNode(matrix, i-1, j, visited,n);
        expandNode(matrix, i+1, j, visited,n);
        expandNode(matrix, i, j-1, visited,n);
        expandNode(matrix, i, j+1, visited,n);
    }
}
