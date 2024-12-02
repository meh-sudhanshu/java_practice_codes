import java.util.Arrays;

class TargetSum{
    public static void main(String arge[]) {
        int[] arr = {8,-1,2,-2,4,5,6,-7,12};
        int target = 1400;
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