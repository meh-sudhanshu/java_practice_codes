import  java.util.*;
class TwoPointer{
    public static void main(String[] args){
        int[] arr = {2,5,2,7,-5,9,3,12,54};
        int target = 16;
        System.out.println(isPairExist(arr,target));
    }

    public static boolean isPairExist(int[] arr,int target){
        Arrays.sort(arr);
        int i=0, j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j] < target) i++;
            if(arr[j]+arr[i] > target) j--;
            if(arr[i]+arr[j] == target) return true;
        }
        return false;
    }
}