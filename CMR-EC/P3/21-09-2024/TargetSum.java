import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {2,-1,4,7,8,12,26};
        int target = 23;
        Arrays.sort(arr);
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            if (arr[i] + arr[j] == target) return true;
            if (arr[i] + arr[j] > target) j--;
            if (arr[i] + arr[j] < target) i++;
        }
        return false;
    
    }
}
