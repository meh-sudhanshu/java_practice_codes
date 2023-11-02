import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {-2,3,56,-34,-23,18};
        int target = 599;
        System.out.println(twoPointer(arr,target));
    }

    private static boolean twoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0, j = arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target)  i++;
            if(arr[i]+arr[j] > target)  j--;
        }
        return false;
    }
}
