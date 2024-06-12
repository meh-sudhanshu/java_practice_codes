public class ClimbStairs {
    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n+1];
        // long startTime = System.nanoTime();
        // int value1= getCount(n);
        // System.out.println(value1);
        // long endTime = System.nanoTime();
        // System.out.println(endTime-startTime);
        long startTime = System.nanoTime();
        int value1= optimizedGetCount(n, dp);
        System.out.println(value1);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }

    private static int getCount(int n) {
       if(n<=2) return n;
       return getCount(n-1)+getCount(n-2);
    }

    private static int optimizedGetCount(int n, int[] dp){
        if(dp[n] != 0) return dp[n];
        if(n<=2) return n;
        int value1 = optimizedGetCount(n-1, dp);
        dp[n-1] = value1;
        int value2 = optimizedGetCount(n-2, dp);
        dp[n-2] = value2;
        return value1+value2;
    }

}
