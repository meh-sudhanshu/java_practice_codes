public class Recursion1 {
    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n];
        System.out.println(fun(n,dp));
    }

    public static int fun(int n, int[] dp){
        System.out.println("calling fun of "+n);
        if(n<=2){dp[n] = n;
            return n;
        }
        if(dp[n-1] != 0 && dp[n-2] !=0){
            return dp[n-1]+dp[n-2];
        }
        int ans1 = 0;
        int ans2 = 0;

        if(dp[n-1] !=0) ans1 = dp[n-1];
        else ans1 = fun(n-1, dp);

        if(dp[n-2] !=0) ans2 = dp[n-2];
        else ans2 = fun(n-2, dp);

        
        dp[n-1] = ans1;
        dp[n-2] = ans2;
        return ans1+ans2;
    }
}
