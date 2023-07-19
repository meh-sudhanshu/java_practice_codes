import java.util.Arrays;

class Pairs{
    public static void main(String[] args) {
        int[] arr ={1,5,2,7,9,-5,-4,8,3,9,-5};
        int target = 100;

        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target){
                return true;
            }
            if(arr[i]+arr[j] < target) i++;
            if(arr[i]+arr[j] >
             target) j--;
        }
        return false;
    }
}