import java.util.Arrays;

class TargetSum{
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4,6,7,-9,10,6,2}; 
        int target = 700
        ;

        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0,  j = arr.length-1;
        while (i < j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] > target) j-=1;
            if(arr[i]+arr[j] < target) i+=1;
        }
        return false;
    }
}