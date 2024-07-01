public class OneToNArray {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {2,1,4,5,8,9,10,6,7};
        int ans = getMissingNumber(arr,n);
        System.out.println(ans);
    }

    private static int getMissingNumber(int[] arr,int n) {
       int ans = 0;
       for(int i=1;i<=n;i++) ans = ans^i;

       for(int e : arr) ans = ans ^ e;

       return ans;
    }
}
