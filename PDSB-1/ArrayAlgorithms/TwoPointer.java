import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {-2,3,67,34,23,76,96,-23,-45};
        int target = 98;
        boolean result = doesPairExist(arr, target);
        System.out.println(result);
    }

    public static boolean doesPairExist(int[] arr, int target){
        // time complexity is n*n
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        return false; 
    }

    public static boolean twoPointerApproach(int[] arr, int target){
        // time complexity is (nlongn+n)
        // nlogn is for sorting the array
        // n is for while loop 
        Arrays.sort(arr);
        int i = 0, j = arr.length -1;
        while (i < j) {
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] < target) i++;
            if(arr[i]+arr[j] > target) j--;
        }
        return false;
    }
}

