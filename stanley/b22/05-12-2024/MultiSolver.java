class MultiSolver{
    public static void main(String[] args) {
        String str = "malayalam";;
        int n = str.length();
        int[][] dp = new int[n][n];
        int j = 0;
        int totalNumberOfPalindromicSubstring = 0;
        while (j < n) {
            int i = 0;
            int jf = j;
            while (jf < n) {
                if (i == jf) {
                    dp[i][jf] = 1;
                    totalNumberOfPalindromicSubstring+=1;
                }else if(Math.abs(i-jf) <=2){
                    if(str.charAt(i) == str.charAt(jf)){
                        dp[i][jf] = 1;
                        totalNumberOfPalindromicSubstring+=1;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(jf)){
                        if(dp[i+1][jf-1] == 1){
                            dp[i][jf] = 1;
                            totalNumberOfPalindromicSubstring+=1;
                        }
                    }
                }
                i+=1;
                jf+=1;
            }
            j+=1;
        }
        System.out.println(totalNumberOfPalindromicSubstring);
    }
}