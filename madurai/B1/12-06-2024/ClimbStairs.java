class ClimbStairs{
    public static void main(String[] args){
        int n = 10;
        int[] dp = new int[n];
        int result = getCount(n,dp);
        System.out.println(result);
    }
    public static int getCount(int n,int[] dp){
        if(dp[n] != 0) return dp[n];
        if(n<=2) return n;
        int n1 = getCount(n-1);
        dp[n-1] = n1;
        int n2 = getCount(n-2);
        dp[n-2] = n2;
        return n1+n2;
        
    }
}