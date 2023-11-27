public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-45,56,-23,-45,56};
        int k = 3;
        int result = getMaximumSubarraySumOfSizeK(arr,k);
        System.out.println(result);
    }

    private static int getMaximumSubarraySumOfSizeK(int[] arr, int k) {
        int ans = Integer.MIN_VALUE;
        int ps = ans;
        int i =0 , j = k-1;
        while (j<arr.length) {
            int cs = 0;
            if(i==0){
                for(int z = i; z<=j;z++){
                    cs+=arr[z];
                }
            }else{
                cs = ps-arr[i-1]+arr[j];
            }

            ans = Math.max(ans,cs);
            ps = cs;
            i++;
            j++;
        }

        return ans;
    }
}
