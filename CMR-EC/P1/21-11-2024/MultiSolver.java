class MultiSolver {
    public static void main(String[] args) {
        String str = "axaxyyxaz";
        int n = str.length();
        int[][] dp = new int[n][n];
        int j = 0;
        int count = 0;
        while (j < n) {
            int i = 0;
            int jFlag = j;
            while (jFlag < n) {
                if (i == jFlag) {
                    dp[i][jFlag]  = 1;
                    count+=1;
                }else if ( Math.abs(i - jFlag) <= 2){
                    if(str.charAt(i) == str.charAt(jFlag)){
                        dp[i][jFlag] = 1;
                        count+=1;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(jFlag)){
                        if(dp[i+1][jFlag-1] == 1){
                            dp[i][jFlag] = 1;
                            count+=1;
                        }
                    }
                }
                i+=1;
                jFlag+=1;
            }


            j+=1;
        }
        System.out.println(count);
    }
}