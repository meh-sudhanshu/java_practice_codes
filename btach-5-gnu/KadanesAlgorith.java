public class KadanesAlgorith {
    public static void main(String[] args) {
        int[] arr = {-5,-9,-2,4,4,-4,3,-5,66,-66,-45,46};
        int ans = getAns(arr);
                System.out.println(ans);
            }
        
        private static int getAns(int[] arr) {
            int ans = Integer.MIN_VALUE;
            int cts = 0;
            for(int i=0;i<arr.length;i++){
                if (cts < 0) {
                    cts = 0;
                }
                cts+= arr[i];
                if (cts > ans) {
                    ans  = cts;
                }
            }
            return ans;
        }
}
