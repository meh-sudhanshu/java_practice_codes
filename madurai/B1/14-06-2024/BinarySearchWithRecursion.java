import java.util.*;
class BinarySearchWithRecursion{
    public static void main(String[] args){
        int[] arr = {1,4,2,-65,5,-98,-67,45,3,-987,567,-765};
        Arrays.sort(arr);
        int searchValue = 45;
        int i=0, j= arr.length-1;
        boolean ans = binarySearch(arr,searchValue,i,j);
        System.out.println(ans);
    }
    private static boolean binarySearch(int[] arr,int searchValue, int si, int ei){
        if(si < ei){
            int mid = (si+ei)/2;
            if(arr[mid] == searchValue){
                return true;
            }
            if(arr[mid] < searchValue){
                return binarySearch(arr,searchValue,mid+1,ei);
            }else{
                return binarySearch(arr,searchValue,si,mid-1);
            }
        }
        return false;
    }
}