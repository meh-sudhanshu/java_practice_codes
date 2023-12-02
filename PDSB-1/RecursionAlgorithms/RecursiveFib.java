public class RecursiveFib {
    public static void main(String[] args) {
        int n =5;
        int ans = getSumRecursively(n-2,1,0,1);
        System.out.println(ans);
    }
    private static int getSumRecursively(int n
     , int ans, int first, int sec) {
        if (n == 0) { 
            return ans;}
        int next = first+sec;
        ans+=next;
        first = sec;
        sec = next;
        return getSumRecursively(n-1, ans, first, sec);
    }
}
