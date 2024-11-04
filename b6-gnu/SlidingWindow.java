public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-5,-9,-2,4,4,-4,3,-5,66,-66,-45,46};
        int k  = 4;
        int ans = getSum(arr,k);
                System.out.println(ans);
            }
        
        private static int getSum(int[] arr, int k) {
              int i = 0, j = k-1, sum = 0;
              int ps = 0, ans = Integer.MIN_VALUE;
              while (j < arr.length) {
                if (i == 0) {
                    for(int l = i; l <=i;l++) sum = sum + arr[i];
                    ps = sum;
                }else{
                    sum = ps - arr[i-1]+ arr[j];
                    ps = sum;
                }
                i+=1;
                j+=1;
                if (sum > ans) {
                    ans = sum;
                }
                
              }
              return ans;
        }
}
