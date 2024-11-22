public class ClimbStairs {
    public static void main(String[] args) {
        int n =10;
        int[] dp = new int[n+1];
        int ans = findNumberOfConfigs(n,dp);
        System.out.println(ans);
    }
    private static int findNumberOfConfigs(int n, int[] dp ){
        if (n > 0 && n <= 2) {
            dp[n] = n;
            return n;
        }
        if (n >0) {
            if (dp[n] != 0) {
                return dp[n];
            }
        }
      
        int ans1 = findNumberOfConfigs(n-1, dp);
        dp[n-1] = ans1;

        int ans2 = findNumberOfConfigs(n-2, dp);
        dp[n-2] = ans2;

        return ans1+ans2;
    }
}
