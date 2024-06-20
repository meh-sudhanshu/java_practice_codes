

class SlidingWindow{
    public static void main(String[] args){
        int[] arr = {-2,3,4,2,-5,-6,7,-5,-7,8,-56};
        int ws = 4;
        int ans = getMaximumSum(arr,ws);
        System.out.println(ans);
    }
    public static int getMaximumSum(int[] arr, int ws){
        int ans = Integer.MIN_VALUE;
        int i=0, j = ws-1;
        int previousSum = 0;
        while(j < arr.length){
            int currentSum = 0;
            if(i == 0){
                for(int k=i;k<=j;k++) currentSum+=arr[k];
                previousSum = currentSum;
            }else{
                currentSum = previousSum - arr[i-1]+arr[j];
                previousSum = currentSum;
            }
            i+=1;
            j+=1;
            ans = Math.max(ans,currentSum);

        }
        return ans;
    }
}