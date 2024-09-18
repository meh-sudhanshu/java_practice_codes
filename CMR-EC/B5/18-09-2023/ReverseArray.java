import java.util.Arrays;

class ReverseArray{
    public static void main(String args[]){
        int []arr = {10,20,30,40,50,60};
        int n = arr.length;
        int i = 0, j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=1;
            j-=1;
        }
        System.out.println(Arrays.toString(arr)); 
    }
}