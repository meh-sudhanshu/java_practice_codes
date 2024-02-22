import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {3,-1,2,7,9,-5,4,12};
        int target = 130;
        System.out.println(isPairExist(arr,target));
    }

    private static boolean isPairExist(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i < j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] > target) j--;
            if(arr[i]+arr[j] < target) i++;
        }
        return false;
    }
}
