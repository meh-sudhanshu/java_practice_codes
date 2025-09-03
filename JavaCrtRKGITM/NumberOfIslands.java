public class NumberOfIslands {
    static int ans = 0;
    public static void main(String[] args) {
        int[][] zooland = {{1,1,0,0,0},{0,0,0,1,1},{1,1,1,0,0},
                    {0,0,0,0,0},{1,1,1,0,0}
        }; 
        int m = 5;
        int n = 5;
        int[][] visited = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n; j++){
                if(zooland[i][j] == 1 && visited[i][j] == 0){
                    getNumberOfIslands(zooland, visited, i, j,m,n);
                    ans+=1;
                }
            }
        }
        System.out.println(ans);
    }
    public static void getNumberOfIslands(int[][] zooland,
                        int[][] visited,int i, int j,int row, int col){
        
        if(i < 0 || i>= row || j < 0 || j>=col || visited[i][j] == 1 || zooland[i][j] == 0){
            return;
        }

        visited[i][j] = 1;

        getNumberOfIslands(zooland, visited, i-1, j, row, col);
        getNumberOfIslands(zooland, visited, i+1, j, row, col);
        getNumberOfIslands(zooland, visited, i, j+1, row, col);
        getNumberOfIslands(zooland, visited, i, j-1, row, col);

    }
}
