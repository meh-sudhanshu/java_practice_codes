public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,-2,4,5,-5,6,9,-1};
        int ws = 3;
        getMaximumSuarraySum(arr,ws);
    }

    private static void getMaximumSuarraySum(int[] arr, int ws) {
        int ans = Integer.MIN_VALUE, si = -1, ei = -1;
        int i = 0, j = ws-1;
        int previousSum = -1;
        while (j < arr.length) {
            int sum = 0;
            if (i == 0) {
                for(int k = i; k <=j;k++) sum+=arr[k];
                previousSum = sum;
            }else{
                sum = previousSum - arr[i-1] + arr[j];
                previousSum = sum;
            }
            i+=1;
            j+=1;
            if (sum > ans) {
                ans = sum;
                si = i;
                ei = j;
            }
        }
        System.out.println(si+" "+ei+" "+ans);
    }
}
