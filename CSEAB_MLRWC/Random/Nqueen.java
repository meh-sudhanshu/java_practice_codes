







class Nqueen{
    public static void nQueen(int n, int[][] board, int[] col, int[] dia, int[] revDiag, int row){
        if(row == n){
            for(int[] arr : board){
                for(int e : arr){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            return;
        }
        for(int j =0 ; j< n; j++){
            if(col[j] == 0 && dia[j-row+n] == 0 && revDiag[row+j] == 0){
                col[j] = 1;
                dia[j-row+n] = 1;
                revDiag[row+j] = 1;
                board[row][j] = 1;
                nQueen(n, board, col, dia, revDiag, row+1);
                col[j] = 0;
                dia[j-row+n] = 0;
                revDiag[row+j] = 0;
                board[row][j] = 0;
            }
        }

    }
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        int[] col = new int[n];
        int[] diag = new int[2*n + 1];
        int[] revDiag = new int[2*n + 1];
        nQueen(n,board,col,diag,revDiag,0);
    }
}