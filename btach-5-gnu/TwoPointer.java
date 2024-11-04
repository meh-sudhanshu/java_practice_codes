import java.util.Arrays;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {5,9,-2,4,3,5,6,-45,46};
        int target = 19;
        boolean ans = isPairExists(arr,target);
                System.out.println(ans);
    }
    private static boolean isPairExists(int[] arr , int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while (i<j) {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum > target) j--;
            if(sum < target) i++;
        }

        return false;
    }
        
        
}