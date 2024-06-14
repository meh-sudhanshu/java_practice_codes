import java.util.*;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,7,6,-76,-76,-87,-876,5,4,77,65,7};
        Arrays.sort(arr);
        int searchValue = -7652145;
        boolean ans = binarySearch(arr,searchValue,0,arr.length-1);
        System.out.println(ans);
    }

    private static boolean binarySearch(int[] arr, int searchValue, int si, int ei) {
        if(si<=ei){
            var mid = (si+ei)/2;
            if(arr[mid] == searchValue) return true;
            if(arr[mid] < searchValue){
                return binarySearch(arr, searchValue, mid+1, ei);
            }
            return binarySearch(arr, searchValue, si, mid-1);
        }
        return false;
    }
}
