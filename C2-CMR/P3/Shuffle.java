import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,0,0,0,1,0,1,0,0,0};
        int zeroCount = 0;
        for(int i = 0; i < arr.length; i++){
            int e = arr[i];
            if(e == 0) zeroCount+=1;
        }
        for(int i = 0; i<arr.length; i++){
            if(i < zeroCount) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
