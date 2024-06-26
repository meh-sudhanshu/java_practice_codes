import java.util.HashMap;

public class ClimbStairsUsingHashMap {
    public static void main(String[] args) {
        int n = 100;
        HashMap<Integer,Long> dp = new HashMap<>();
        long ans = getNumberOfWays(n,dp);
        System.out.println(ans);
    }

    private static long getNumberOfWays(int n,HashMap<Integer,Long> dp) {
       if(dp.containsKey(n)) return dp.get(n);
       if(n <= 2) return n;
       long ans1 = getNumberOfWays(n-1, dp);
       dp.put(n-1,ans1);
       long ans2 = getNumberOfWays(n-2, dp);
       dp.put(n-2,ans2);
       return ans1+ans2;
    }
}
