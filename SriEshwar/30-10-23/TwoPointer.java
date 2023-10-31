import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {-34,12,65,76,98,34,56,76,101};
        int target = 99;

        System.out.println(isPairExist(arr, target));

    }

    public static boolean isPairExist(int[] arr, int target){
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target)  i++;
            if(arr[i]+arr[j] > target)  j--;
        }

        return false;
    }
}
