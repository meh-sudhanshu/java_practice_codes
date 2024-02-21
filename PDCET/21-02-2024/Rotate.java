import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {3,2,7,4,8,2,9,5,-1};
        int pi = 5;
        arr = rotateArr(arr,pi);
        System.out.println(Arrays.toString(arr)); 
    }

    private static int[] rotateArr(int[] arr, int pi) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(i < pi){
                queue.add(arr[i]);
            }else{
                st.push(arr[i]);
            }
        }
        int k = 0;
        while (st.size() != 0) {
            arr[k++] = st.pop();
        }
        while (queue.size() != 0) {
            arr[k++] = queue.poll();
        }
        return arr;
    }
}
