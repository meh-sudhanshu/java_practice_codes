
public class Substring {
    public static void main(String[] args) {
        String str = "axaxamadamy";
        int n = str.length();
        int[][] dp = new int[n][n];
        int i=0, j= 0;
        while (j < n) {
            i = 0;
            int jFlag = j;
            while (jFlag < n) {
                if(i == jFlag){
                    dp[i][jFlag] = 1;
                }else if(Math.abs(i-jFlag) <= 2){
                    if(str.charAt(i) == str.charAt(jFlag)){
                        dp[i][jFlag] = 1;
                    }else{
                        dp[i][jFlag] =0;
                    }
                }else{
                    if(str.charAt(i) != str.charAt(jFlag)){
                        dp[i][jFlag] = 0;
                    }else{
                        dp[i][jFlag] = dp[i+1][j-1];
                    }
                }
                i++;
                jFlag++
                ;
            }
            j++;
        }

        for(int[] arr : dp){
            for(int e: arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
