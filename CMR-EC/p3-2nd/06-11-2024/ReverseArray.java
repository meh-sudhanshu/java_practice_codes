import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,7,22,78,94,67};
        int  i = 0, j = arr.length - 1;
        while ( i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=1;
            j-=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
