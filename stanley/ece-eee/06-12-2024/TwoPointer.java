import java.util.Arrays;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {-3,8,-2,9,7,6,12,-18,16,4};
        int target = 21;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    private static boolean isPairExist(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i < j) {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum > target) j--;
            if(sum < target)i++;
        }
        return false;
    }
}