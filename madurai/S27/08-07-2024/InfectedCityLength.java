public class InfectedCityLength {

    static  int numberOfCities = 0;
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0,0,1},{0,0,0,0,1},{1,1,1,0,1},{0,0,1,0,1},{0,0,1,0,0}};
        int n = 5;
        int[][] visited = new int[n][n];
        int i = 2, j= 0;
        expandNode(matrix,i,j,visited,n,InfectedCityLength.numberOfCities);
        System.out.println(numberOfCities);
    }

    private static void expandNode(int[][] matrix, int i, int j, int[][] visited,int n, int numberOfCities) {
        if(i<0 || i>=n || j<0 || j>=n || matrix[i][j] == 0 || visited[i][j] == 1){
            return;
        }
        visited[i][j] = 1;
        InfectedCityLength.numberOfCities++;
        expandNode(matrix, i-1, j, visited,n,InfectedCityLength.numberOfCities);
        expandNode(matrix, i+1, j, visited,n,InfectedCityLength.numberOfCities);
        expandNode(matrix, i, j-1, visited,n,InfectedCityLength.numberOfCities);
        expandNode(matrix, i, j+1, visited,n,InfectedCityLength.numberOfCities);
    }
}
