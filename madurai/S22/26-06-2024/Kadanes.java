public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-3,4,2,5,-5,-7,10,4,-89};
        int ans = getMaximumSubarraySum(arr);
        System.out.println(ans);
    }

    private static int getMaximumSubarraySum(int[] arr) {
       int ans = Integer.MIN_VALUE;
       int cts = 0;

       for(int i=0;i<arr.length;i++){
            if(cts < 0) cts = 0;
            cts += arr[i];
            ans = Math.max(ans,cts);

       }
       return Math.max(ans,cts);
    }
}
