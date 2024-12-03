import java.util.Arrays;

public class TargetSum{
    public static void main(String[] args) {
        int[] arr = {3,-2,9,8,15,3,-2,-7,6};
        int target = 23;
        boolean ans = isPairExits(arr,target);
        System.out.println(ans);
    }
    private static boolean isPairExits(int[] arr,
        int target
    ){
        Arrays.sort(arr);
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