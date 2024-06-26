import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {-3,1,-5,3,-6,12,24,45,76,87,-87};
        int target = 1000;
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0, j= arr.length-1;


        while (i<j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target) i+=1 ;
            if(arr[i]+arr[j] > target) j-=1 ;
        }
        return false;

    }
}
