
import java.util.*;
class TargetSum{
     public static void main(String[] sudhanshu){
        int[] arr = {1,2,8,9,5,6,-8};
        int target = 3;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }
    public static boolean isPairExist(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while(i < j){
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum > target) j-=1;
            if(sum < target) i+=1;
        }
        return false;
    }
}