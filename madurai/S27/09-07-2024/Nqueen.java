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
        if(row == n){
            System.out.println(csf);
            return;
        }
        for(int i=0;i<n;i++){
            // i = row
            if(col[i] == 0 && diagonal[row-i+n] == 0 && revDaigonal[row+i] == 0){
                col[i] = 1;
                diagonal[row-i+n] = 1;
                revDaigonal[row+i] = 1;
                printAllConfigs(board, n, col, diagonal, revDaigonal,
                    csf == "" ? row+"->"+i : csf+","+row+"->"+i 
                , row+1);
                col[i] = 0;
                diagonal[row-i+n] = 0;
                revDaigonal[row+i] = 0;
            }
        }
    }    
}
