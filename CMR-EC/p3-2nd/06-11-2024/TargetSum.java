import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {98,-23,4,2,7,12,56};
        int target = 19;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    private static boolean isPairExist(int[] arr, int target) {
        Arrays.sort(arr); // nlogn
        int i = 0, j = arr.length-1;
        while (i < j) {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum > target) j--;
            if(sum < target) i++;
        }
        return false;
    }
}
