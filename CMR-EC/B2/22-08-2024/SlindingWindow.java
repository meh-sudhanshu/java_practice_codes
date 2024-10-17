public class SlindingWindow {
    public static void main(String[] args) {
        int[] arr = {-3,4,8,5,-6,-3,4,9,-30};
        int ws = 3;

        int ans = getMaximumSubArraySumOfSizeK(arr,ws);
        System.out.println(ans);
    }
    private static int getMaximumSubArraySumOfSizeK(int[] arr,int ws){
        int ans = Integer.MIN_VALUE;
        int previousSum = 0;
        int i = 0, j = ws-1;
        while (j < arr.length) {
            int currentSum = 0;
            if (i == 0) {
                for(int l = i;l<=j;l++) currentSum+=arr[l];
                previousSum = currentSum;
            }else{
                currentSum = previousSum - arr[i-1] + arr[j];
                previousSum = currentSum;
            }
            if (currentSum > ans) {
                ans = currentSum;
            }
            i+=1;
            j+=1;
        }
        return ans;
    }
}
