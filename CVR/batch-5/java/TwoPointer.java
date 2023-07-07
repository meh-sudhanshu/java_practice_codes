import java.util.Arrays;
class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,3,56,-7,78,9};
        int target = 7;
        System.out.println(findIfPairExists(arr,target));
    }
    private static boolean findIfPairExists(int[] arr, int target) {
       Arrays.sort(arr);
       int i=0,j=arr.length-1;
       while(i<j){
            if(arr[i]+arr[j] == target) return true;
             if(arr[i]+arr[j] < target) i++;
             if(arr[i]+arr[j] > target) j--;
       }
       return false;
    }
}