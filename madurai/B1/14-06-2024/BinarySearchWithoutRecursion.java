import java.util.*;
class BinarySearchWithoutRecursion{
    public static void main(String[] args){
        int[] arr = {1,4,2,-65,5,-98,-67,45,3,-987,567,-765};
        Arrays.sort(arr);
        int searchValue = 45;
        int i=0, j= arr.length-1;
        boolean ans = false;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid] == searchValue){
                ans = true;
                break;
            }else if (arr[mid] > searchValue){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        System.out.println(ans);
    }
}