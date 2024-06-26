public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-3,1,-5,3,-6,12,24,45,76,87,-87};
        int ans = getMaximumSum(arr);
        System.out.println(ans);
    }

    private static int getMaximumSum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int cts = 0;

        for(int i=0;i<arr.length;i++){
            if(cts < 0) cts = 0;
            cts+=arr[i];
            ans = Math.max(ans,cts);
        }

        return Math.max(ans, cts);
    }
}
