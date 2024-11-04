import java.util.Arrays;

class TargetSum{
    public static void main(String[] args) {
        int[] arr = {-5,-9,-2,4,4,-4,3,-5,66,-66,-45,46};
        int target = 45;
        boolean ans = isPairExist(arr,target);
                System.out.println(ans);
            }
        
            private static boolean isPairExist(int[] arr, int target) {
                Arrays.sort(arr);
                int i = 0, j = arr.length-1;
                while (i<j) {
                    int sum  = arr[i]+arr[j];
                    if (sum == target) return true; 
                    if (sum > target) j--; 
                    if (sum < target) i++; 
                }
                return false;
            }
}