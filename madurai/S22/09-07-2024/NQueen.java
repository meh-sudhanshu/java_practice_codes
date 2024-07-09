class NQueen{
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        int[] col = new int[n];
        int[] diagonal = new int[(2*n)-1];
        int[] reverseDiagonal = new int[(2*n)-1];
        printAllConfigs(n,board,0,col,diagonal,reverseDiagonal,"");
    }

    private static void printAllConfigs(int n,int[][] board, int row, int[] col, int[] diagonal, int[] reverseDiagonal,
            String csf) {
        if(row == n){
            System.out.println(csf);
            return;
        }
        for(int i = 0;i<n;i++){
            if(col[i] == 0 && diagonal[row-i+n]==0 && reverseDiagonal[i+row] == 0){
                col[i] = 1;
                diagonal[row-i+n] = 1;
                reverseDiagonal[i+row] = 1;
                printAllConfigs(n, board, row+1, col, diagonal, reverseDiagonal,
                    csf == ""? row+"->"+i : csf+","+row+"->"+i
                );
                col[i] = 0;
                diagonal[row-i+n] = 0;
                reverseDiagonal[i+row] = 0;
            }
        }
       
    }
}