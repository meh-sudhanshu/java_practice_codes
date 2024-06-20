import java.util.*;
class SlidingWindow{
    public static void main(String[] sudhanshu){
        int[] arr = {1,3,-1,-3,7,-4,3,2,9,-11,9,9,9};
        int ws = 3;

        int ans = getMaximumSubarraySum(arr,ws);
        System.out.println(ans);
    }
    public static int getMaximumSubarraySum(int[] arr,int ws){
        // implement this method
        int i=0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int previousSum = 0;
        while(j < arr.length){
            int currentSum = 0;
            if(i == 0){
                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }
                previousSum = currentSum;
            }else{
                currentSum = (previousSum - arr[i-1])+arr[j];
                previousSum = currentSum;
            }
            //System.out.println("current sum "+currentSum);
            ans = Math.max(ans,currentSum);
            i+=1;
            j+=1;
        }
        return ans;
    }
}