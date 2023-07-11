public class DPSubstring {
    public static void main(String[] args) {
        String str = "axbabxabz";
        int n = str.length();
        int[][] dp = new int[n][n];
        int i=0,j=0;
        int jFlag = 0;
        while(jFlag<n){
            if(i==j){
                dp[i][j]=1;
            }else if(Math.abs(i-j)==1){
                if(str.charAt(i)==str.charAt(j)){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=0;
                }
            }else{
                if(i+1 < n && j-1 >0 &&    str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=0;
                }
            }
            i++;j++;
            if(j>=n){
                i=0;
                jFlag++;
                j=jFlag;    

            }
        }
        
        for(int[] arr: dp){
            for(int e : arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
