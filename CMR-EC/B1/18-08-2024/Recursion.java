public class Recursion {
    public static void main(String[] args) {
        int n = 90;
        long[] dp = new long[n+3];
        long ans = executeRecursion(n,dp);
        System.out.println(ans);
    }


    public static long executeRecursion(int n,long[] dp){

        if(n <= 2){
            if(n >= 0){
                dp[n] = n;
            }
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }
        
        

        long ans1 = executeRecursion(n-2, dp);
        if (n-2 >=0) {
            dp[n-2] = ans1;
        }

        long ans2 = executeRecursion(n-4, dp);
        if (n-4 >=0) {
            dp[n-4] = ans2;
        }

        long ans3 = executeRecursion(n-6, dp);
        if(n-6 >=0){
            dp[n-6] = ans3;
        }

        return ans1+ans2+ans3;


    }
}
