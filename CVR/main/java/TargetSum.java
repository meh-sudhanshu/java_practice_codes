import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,-3,4,4,5,6,77,4,3};
        int target = 7;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    // brute forced approach
    private static boolean isPairExist(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    private static optimizedIsPairExists(int[] arr, int target){
            //{2,3,4,1,-3,4,4,5,6,77,4,3}
            // target = 7
            // -3 , 1, 2, 3, 3 ,4 , 4, 4,4, 5, 6, 77
            Arrays.sort(arr);
            int i = 0, j = arr.length-1;
            while(i<j){
                if(arr[i]+arr[j] == target) return true;
                if(arr[i]+arr[j] < target) i++;
                if(arr[i]+arr[j] > target) j--;

            }
            return false;

    }
}
