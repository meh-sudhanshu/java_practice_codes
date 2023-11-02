import java.util.Arrays;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {3,-4,13,7,-9,16,-3,-5,4};
        int target = 177;
        System.out.println(isPairExist(arr, target));
    }
    public static boolean isPairExist(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length -1;
        while (i<j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target) i++;
            if(arr[i]+arr[j] > target) j--;
        }
        return false;
    }
}