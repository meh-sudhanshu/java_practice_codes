import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {-3,8,7,-5,2,6,17,-9,8,4};
        int target = 600;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
       Arrays.sort(arr);
       int n = arr.length;
       int i = 0, j = n-1;
       while (i<j) {
            if (arr[i]+arr[j] == target) return true;
            if (arr[i]+arr[j] > target) j--;
            if (arr[i]+arr[j] < target) i++;
       }
       return false;
    }
}
