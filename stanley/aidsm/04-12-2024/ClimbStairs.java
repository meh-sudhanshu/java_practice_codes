public class ClimbStairs {
    public static void main(String[] args) {
        int n = 20;
        int[] dp = new int[n+1];
        int ans = getNumberOfConfigs(n,dp);
        System.out.println(ans);
    }
    private static int getNumberOfConfigs(int n,int[] dp){
        if (n <= 2) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int x = getNumberOfConfigs(n-1,dp);
        dp[n-1] = (int)x;
        int y = getNumberOfConfigs(n-2,dp);
        dp[n-2] = (int) y;
        return x+y;
    }
}
