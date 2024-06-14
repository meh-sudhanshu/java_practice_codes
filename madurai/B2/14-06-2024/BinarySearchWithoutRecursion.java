
import java.util.Arrays;





public class BinarySearchWithoutRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,7,6,-76,-76,-87,-876,5,4,77,65,7};
        Arrays.sort(arr);
        int searchValue = -76;
        boolean ans = false;
        int i=0, j = arr.length-1;
        while(i<=j){
            int mid = (int) Math.floor((i+j)/2);
            if(arr[mid] == searchValue){
                ans = true;
                break;
            }
            else if(arr[mid] > searchValue){
                j = mid-1;
            }else{
                i = mid+1;
            }

        }
        System.out.println(ans);
    }
}
