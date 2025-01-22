import java.util.Arrays;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {3,1,8,7,17,-2,9,8,18,-5,-2};
        int target = 1800;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    private static boolean isPairExist(int[] arr, int target){
        // nlogn
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