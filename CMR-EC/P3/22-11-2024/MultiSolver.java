public class MultiSolver {
    public static void main(String[] args) {
        String str = "ayzzyayxb";
        int n = 9;
        int[][] dp = new int[n][n];
        int col = 0;
        int total = 0;
        while (col < n) {
            int row = 0;
            int flag = col;
            while (flag < n) {
                if(row == flag){
                    dp[row][flag] = 1;
                    total+=1;
                }else if(Math.abs(row-flag) <=2){
                    if (str.charAt(row) == str.charAt(flag)) {
                        dp[row][flag]=1;
                        total+=1;
                    }
                }else{
                    if (str.charAt(row) == str.charAt(flag)) {
                        if(dp[row+1][flag-1] == 1){
                            dp[row][flag] = 1;
                            total+=1;
                        }
                    }
                }
                flag+=1;
                row+=1;
            }
            col+=1;
        }
        System.out.println(total);
    }
}
