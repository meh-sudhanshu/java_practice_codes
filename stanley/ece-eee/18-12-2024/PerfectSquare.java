public class PerfectSquare {
    public static void main(String[] args) {
        int n = 59;
        boolean ans = binarySearch(n);
        System.out.println(ans);
    }
    private static boolean binarySearch(int n){
        int low = 0, high = (int)n/2;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(mid*mid == n) return true;
            if(mid*mid > n) high = mid-1;
            if(mid*mid < n) low = mid+1;
        }
        return false;
    }
}
