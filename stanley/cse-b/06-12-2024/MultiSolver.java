import java.util.Arrays;

class MultiSolver{
    public static void main(String[] args) {
        String str = "malayalam";
        int n = str.length();
        int countOfPalindromicSubstring = 0;
        int[][] dp = new int[n][n];
        int j = 0;
        while (j < n) {
            int row = 0, col = j;
            while (col < n) {
                if(row == col){
                    dp[row][col] = 1;
                    countOfPalindromicSubstring+=1;
                }else if(col-row <=2 ){
                    if(str.charAt(row) == str.charAt(col)){
                        countOfPalindromicSubstring+=1;
                        dp[row][col] = 1;
                    }
                }else{
                    if(str.charAt(row) == str.charAt(col)){
                        if(dp[row+1][col-1] == 1){
                            dp[row][col] = 1;
                            countOfPalindromicSubstring+=1;
                        }
                    }
                }
                row+=1; col+=1;
            }
            j+=1;
        }
        System.out.println(countOfPalindromicSubstring);
    }
}