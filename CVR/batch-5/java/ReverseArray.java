public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,-9,34,5,6,7,8,9};
        int i=0, j = arr.length-1;

        while(i<j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;j--;
        }

        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
