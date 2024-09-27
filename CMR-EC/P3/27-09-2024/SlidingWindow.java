class SlidingWindow{
    public static void main(String[] args) {
        int[] arr = {1,-2,4,6,56,78,34,-43,-54};
        int k= 3;
        int ans = getMaximumSubarraySum(arr,k);
        System.out.println(ans);
    }
    private static int getMaximumSubarraySum(int[] arr,int k){
        int ans = Integer.MIN_VALUE;
        int i = 0, j = k-1;
        int ps = -1;
        while (j < arr.length) {
            int sum = 0;
            if(i == 0){
                for(int l=i;l<=j;l++) sum += arr[l];
                ps = sum;
            }else{
                sum = ps - arr[i-1]+arr[j];
                ps = sum;
            }
            if(sum > ans) ans = sum;


            i+=1;
            j+=1;
        }
        




        return ans;
    }
}