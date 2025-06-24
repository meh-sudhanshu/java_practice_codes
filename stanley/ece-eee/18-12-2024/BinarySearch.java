class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-20,32,45,67,87,98,999,1234};
        int searchElement = 87;
        boolean ans = binarySearch(arr,searchElement);
        System.out.println(ans);
    }
    private static boolean binarySearch(int[] arr, int searchElement){
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == searchElement) return true;
            if(arr[mid] > searchElement) high = mid-1;
            if(arr[mid] < searchElement) low = mid+1;
        }
        return false;
    }
}