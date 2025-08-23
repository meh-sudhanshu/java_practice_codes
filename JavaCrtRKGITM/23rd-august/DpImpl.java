

import java.util.*;

class DpImpl{
    public static void main(String[] args){
        int n = 1000;
        //long[] dp = new long[n+1];
        // for(int i = 0; i< dp; i++) dp[i] = Integer.MIN_VALUE;
        // Arrays.fill(dp,Integer.MIN_VALUE)
        // long ans = dpWithArray(n,dp);
        // System.out.println(ans);
        HashMap<Integer,Long> dp = new HashMap<>();
        long ans2 = dpWithHashMap(n,dp);
        System.out.println(ans2);

    }

    public static long dpWithHashMap(int n,HashMap<Integer,Long> dp){
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        if(n <=2 ){
            dp.put(n,(long)n);
            return n;
        }
        long x = dpWithHashMap(n-2,dp);
        dp.put(n-2,x);
        long y = dpWithHashMap(n-4,dp);
        dp.put(n-4,y);
        return x+y;
    }




    public static long dpWithArray(int n,long[] dp){
        if(dp[n] != 0) return dp[n];
        if(n <= 2){
            dp[n] = n;
            return dp[n];
        }
        long x = dpWithArray(n-2,dp);
        dp[n-2] = x;
        long y = dpWithArray(n-4,dp);
        dp[n-4] = y;
        return x+y;
    }
}