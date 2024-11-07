public class ClimbStairs {
    public static void main(String[] args) {
        int n = 50;
        long[] dp = new long[n+1];
        long ans = findNumberWays(n,dp);
        System.out.println(ans);
    }
    private static long findNumberWays(int n, long[] dp){
        if (n <=2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        long ans1 = findNumberWays(n-1, dp);
        dp[n-1] = ans1;
        long ans2 = findNumberWays(n-2, dp);
        dp[n-2] = ans2;
        return ans1+ans2;
    }
}
