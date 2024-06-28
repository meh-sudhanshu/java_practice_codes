

public class UniqueNumber {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1,6,2,10,9,7,5,3,4};
        int ans = getMissingNumber(n,arr);
        System.out.println(ans);
    }

    private static int getMissingNumber(int n, int[] arr) {
       int ans  = 0;
       for(int i=1;i<=n;i++){
            ans = ans^i;
       }
       for(int i=0;i<arr.length;i++) ans = ans^ arr[i];
       return ans;
    }
}
