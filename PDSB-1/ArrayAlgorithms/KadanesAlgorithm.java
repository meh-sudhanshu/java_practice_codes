public class KadanesAlgorithm{
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-6,98,-45,54,-67};

        int result = getMaximumSubArraySum(arr);
        System.out.println(result);
    }

    private static int getMaximumSubArraySum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i<arr.length;i++){
            if(cs < 0) cs = 0;
            if(arr[i] >=0) cs+=arr[i];
            if(arr[i] <0){
                ans = Math.max(ans, cs);
                cs+=arr[i];
            }
        }
        return Math.max(ans,cs);
        
    }
}