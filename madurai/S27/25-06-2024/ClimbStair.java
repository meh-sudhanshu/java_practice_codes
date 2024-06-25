import java.util.*;
class ClimbStair{
    public static void main(String[] args){
        int n = 100;
        long[] dp = new long[n+1];
        System.out.println(Arrays.toString(dp));
        long ans = findNumberOfWays(n,dp);

        System.out.println(ans);
    }

    public static long findNumberOfWays(int n,long[] dp){
        if(dp[n] != 0){
            return dp[n];
        }

        if(n <= 3) return n;
        long ans1 = findNumberOfWays(n-1,dp);
        dp[n-1] = ans1;
        long ans2 = findNumberOfWays(n-2,dp);
        dp[n-2] = ans2;

        return ans1+ans2;
    }
}