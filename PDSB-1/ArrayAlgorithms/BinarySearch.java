package ArrayAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-9,1,23,34,45,56,78,789,987};
        int value = 56;
        boolean result = binarySearch(arr,value,0,arr.length-1);
        System.out.println(result);
    }

    private static boolean binarySearch(int[] arr, int value, int start, int end) {
        while (start <= end) {
            if(start == end){
                return arr[start] == value;
            }
            int mid = (start+end)/2;
            if(arr[mid] == value) return true;
            if(arr[mid] < value) start = mid+1;
            if(arr[mid] > value) end = mid-1;
        }

        return false;
    }
}
