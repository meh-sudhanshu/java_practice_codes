import java.util.*;
class ClimbStairUsingHashMap{
    public static void main(String[] args){
        int n = 100;
        HashMap<Integer,Long> dp = new HashMap<>(); 
        //System.out.println(Arrays.toString(dp));
        long ans = findNumberOfWays(n,dp);

        System.out.println(ans);
    }

    public static long findNumberOfWays(int n,HashMap<Integer,Long>  dp){
        if(dp.containsKey(n)){
            return dp.get(n);
        }

        if(n <= 3) return n;
        long ans1 = findNumberOfWays(n-1,dp);
        dp.put(n-1,ans1);
        long ans2 = findNumberOfWays(n-2,dp);
        dp.put(n-2,ans2);

        return ans1+ans2;
    }
}