import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {4,7,-3,4,9,-56,43,87,45,3,7,2};
        int target = 1000;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {

        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] > target) j-=1;
            if(arr[i]+arr[j] < target) i+=1;
        }

        return false;


    }
}
