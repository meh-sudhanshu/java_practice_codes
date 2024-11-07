class Dp{
    public static void main(String[] args) {
        int n = 12;
        int[] dp = new int[n+1];
        int ans = fun(n,dp);
        System.out.println(ans);
    }
    private static int fun(int n,int[] dp){
        if (dp[n] != 0) {
            return dp[n];
        }
        System.out.println("function with value "+n+" is called !!");
        if (n <= 2) {
            return n;
        }
        int ans1 = fun(n-2,dp);
        if (n-2 >=0) {
            dp[n-2] = ans1;
        }
        int ans2 = fun(n-4, dp);
        if (n-4 >=0) {
            dp[n-4] = ans2;
        }
        return ans1+ans2;
    }
}