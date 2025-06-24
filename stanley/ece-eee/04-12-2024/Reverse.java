import java.util.Arrays;

class Reverse{
    public static void main(String[] args) {
        int[] arr = {2,7,3,6};
        int i = 0, j = arr.length-1;
        while (i<j) {
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i] = temp;
            i+=1;
            j-=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}