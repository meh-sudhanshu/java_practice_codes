

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 50;
        long ans = getNumberOfWays(n);
        System.out.println(ans);
    }

    private static long getNumberOfWays(int n) {
        if (n<=3) {
            return n;
        }
        return getNumberOfWays(n-1)+getNumberOfWays(n-2);
    }
}
