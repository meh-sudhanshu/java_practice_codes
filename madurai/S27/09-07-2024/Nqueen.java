public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        int[] col = new int[n];
        int[] diagonal = new int[(2*n)-1];
        int[] revDaigonal = new int[(2*n)-1];
        printAllConfigs(board,n,col,diagonal,revDaigonal,"",0);
    }

    private static void printAllConfigs(int[][] board, int n, int[] col, int[] diagonal, int[] revDaigonal, String csf, int row) {
        if(row == n-1){
            System.out.println(csf);
            return;
        }
        for(int j=0;j<n;j++){
            // i = row
            if(col[j] == 0 && diagonal[(row-j)+n] == 0 && revDaigonal[row+j] == 0){
                col[j] = 1;
                diagonal[(j-row)+n] = 1;
                revDaigonal[row+j] = 1;
                printAllConfigs(board, n, col, diagonal, revDaigonal, csf+","+row+"->"+j , row+1);
                col[j] = 0;
                diagonal[(j-row)+n] = 0;
                revDaigonal[row+j] = 0;
            }
        }
    }    
}
