
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,-4,13,7,-9,16,-3,-5,4};
        int ws = 4;
        System.out.println(maximumSum(arr,ws));
    }

    private static int maximumSum(int[] arr, int ws) {
        int i = 0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int ps = 0;
        int cs = 0;
        while (j<arr.length) {
            if(i==0){
                for(int k=i;k<=j;k++) cs+=arr[i];
                ps = cs;
            }else{
                cs = ps - arr[i-1]+arr[j];
                ps = cs;
            }
            i++;
            j++;
            ans = Math.max(ans, cs);
        }

        return ans;
    }
}
