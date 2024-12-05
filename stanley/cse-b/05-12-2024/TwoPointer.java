import java.util.Arrays;

class TwoPointer{
    public static void main(String[] sudhanshu) {
        int[] arr = {-3,8,-9,8,2,17,-8,7,6};
        int target = 15;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    private static boolean isPairExist(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j= arr.length-1;
        while (i < j) {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum > target) j--;
            if(sum < target) i++;
        }
        return false;
    }
}