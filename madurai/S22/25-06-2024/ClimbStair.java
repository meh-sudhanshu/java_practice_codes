public class ClimbStair {
    public static void main(String[] args) {
        int n = 100;
        long[] dp = new long[n+1];
        long ans = getNumberOfWays(n,dp);
        System.out.println(ans);
    }

    private static long getNumberOfWays(int n,long[] dp) {
       if(dp[n] != 0) return dp[n];
       if(n <= 2) return n;
       long ans1 = getNumberOfWays(n-1, dp);
       dp[n-1] = ans1;
       long ans2 = getNumberOfWays(n-2, dp);
       dp[n-2] = ans2;
       return ans1+ans2;
    }
}
