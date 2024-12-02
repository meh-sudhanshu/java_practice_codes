import java.util.Arrays;

class ReverseArray{
    public static void main(String[] args){
        int[] arr ={1,4,2,7,5,8,3};
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=1;
            j-=1;
        }
        // for(int k = 0; k < arr.length; k++){
        //     System.out.print(arr[k]+" ");
        // }
        // for(int e : arr){
        //     System.out.print(e+" ");
        // }
        System.out.println(Arrays.toString(arr));
    }
}