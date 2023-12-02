public class NumberOfWays {
    public static void main(String[] args) {
        int n = 53;
        int[] dp = new int[n+1];

        int ans = findNumberOfWays(n,dp);
        System.out.println(ans);
    }

    private static int findNumberOfWays(int n, int[] dp) {
        if(n == 2 || n == 1){
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0) return dp[n];
        int ans1 = findNumberOfWays(n-1, dp);
        int ans2 = findNumberOfWays(n-2, dp);
        dp[n-1] = ans1;
        dp[n-2] = ans2;

        return ans1+ans2; 
    }
}
