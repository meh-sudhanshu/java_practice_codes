public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,-1,2,7,9,-5,4,12};
        int k = 3;
        int ans = Integer.MIN_VALUE;
        int i=0, j = k-1;
        int prevSum = 0;
        while (j<arr.length) {
            int currSum = 0;
            if (i==0) {
                for(int l=i;l<=j;l++) currSum+=arr[l];
                prevSum = currSum;
            }else{
                currSum = prevSum-arr[i-1]+arr[j];
                prevSum = currSum;
            }
            i+=1;
            j+=1;
            ans = Math.max(ans,currSum);
        }
        System.out.println(ans);
    }
}
