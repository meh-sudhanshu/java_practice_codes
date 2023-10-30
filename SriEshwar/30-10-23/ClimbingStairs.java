public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findNumberOfWays(n));
    }

    private static int findNumberOfWays(int n) {
        if(n==1 || n==2) return n;

        return findNumberOfWays(n-1)+findNumberOfWays(n-2);
    }
}
