


class Nqueen{
    public static void main(String[] args){
        int n = 6;
        int[][] board = new int[n][n];
        int[] col = new int[n];
        int[] dia = new int[2*n];
        int[] rev = new int[2*n];
        nQueen(n,board,0,col,dia,rev);
    }
    public static void nQueen(int n, int[][] board,int row, int[] col, int[] dia, int[] rev){

        if(row == n){
            for(int[] arr: board){
                for(int e : arr){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
        }
        for(int i = 0; i< n; i++){
            if(col[i] == 0 && dia[i-row+n] == 0 && rev[i+row] == 0){
                col[i] = 1;
                dia[i-row+n] = 1;
                rev[i+row] = 1;
                board[row][i] = 1;
                nQueen(n,board,row+1,col,dia,rev);
                board[row][i] = 0;
                col[i] = 0;
                dia[i-row+n] = 0;
                rev[i+row] = 0;
            }
        }

    }
}