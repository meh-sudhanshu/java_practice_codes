public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {5,9,-2,4,3,5,6,-45,46};
        int k = 3;
        int ans = getMaximumSubarraSum(arr,k);
            System.out.println(ans);
        }
        
        private static int getMaximumSubarraSum(int[] arr, int k) {
            int ans = Integer.MIN_VALUE;
            int i = 0, j = k-1;
            int ps = 0;
            while (j < arr.length) {

                int cs = 0;
                if (i == 0) {
                    for(int l = i; l<=j;l++) cs+=arr[l];
                    ps = cs;
                }else{
                    cs = ps - arr[i-1]+arr[j];
                    ps = cs;
                } 
                if (cs > ans) {
                    ans = cs;
                }
                i++;
                j++;
            }
            return ans;
        }
    
}
