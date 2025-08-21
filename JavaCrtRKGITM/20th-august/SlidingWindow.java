

class Main{
    public static void main(String[] sudhanshu){
        int[] arr = {1,2,8,9,5,6,-8};
        int k = 3;
        int ans = getMaximumSubarraySumOfSizeK(arr,k);
        System.out.println(ans);
    }
    public static int getMaximumSubarraySumOfSizeK(int[] arr, int k){
        int ans = Integer.MIN_VALUE;
        int i = 0, j = k-1;
        int sum = 0;
        while(j < arr.length){
            if(i == 0){
                for(int l =i ; l<=j; l++) sum+=arr[l];
            }else{
              sum =   sum-arr[i-1]+arr[j];
            }
            i+=1;j+=1;
            if(sum > ans) ans = sum;
        }
        return ans;
    }
}