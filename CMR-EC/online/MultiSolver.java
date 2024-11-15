public class MultiSolver {
    public static void main(String[] args) {
        String str = "axamadama";
        int n = 3;
        int[][] dp = {{3,9,8},{2,5,6},{7,3,2}};
        mutiSolver(str,dp,n);
    }   
    private static void mutiSolver(String str,int[][] dp,int n){
        int columnIndex = 0;
        while (columnIndex < n) {
            int ri = 0;
            int ci = columnIndex;
            while (ci < n) {
                System.out.print(dp[ri][ci]+" ");
                ri+=1;
                ci+=1;
            }
            columnIndex+=1;
        }
    }
}