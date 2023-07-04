public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,23,4,5,6,7,8,12,34};
        int i =0 , j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
