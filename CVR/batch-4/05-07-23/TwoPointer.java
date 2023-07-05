import java.util.Arrays;

class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,4,5,6,7,8,-20};
        int target = 13;
        System.out.println(targetSum(arr,target));
    }
    public static boolean targetSum(int[] arr,int target){
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        while(i<j){

            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target) i++;
            if(arr[i]+arr[j] > target) j--;
        }

        return false;
         
    }
}