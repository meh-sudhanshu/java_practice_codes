public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,-2,5,6,-9,8,-7,6,5};
        int ws = 3;
        int ans = getMaximumSubArraySumOfSizeK(arr,ws);
        System.out.println(ans);
    }

    private static int getMaximumSubArraySumOfSizeK(int[] arr, int ws) {
        int ans  = Integer.MIN_VALUE;
        int currentSum = 0;
        int previousSum = 0;
        int i=0,j=ws-1;
        while (j < arr.length) {
            if (i == 0) {
                for(int l=i;l<=j;l++) currentSum+=arr[l];
                previousSum = currentSum;
            }else{
                currentSum = previousSum - arr[i-1]+arr[j];
                previousSum = currentSum;
            }
            i+=1;
            j+=1;
            if(currentSum > ans){
                ans = currentSum;
            }
        }
        return ans;
    }
}
