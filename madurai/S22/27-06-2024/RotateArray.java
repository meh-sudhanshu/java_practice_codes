import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {3,2,4,-5,6,7,9,12};
        int pi = 3;
        arr = rotateArray(arr,pi);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] rotateArray(int[] arr,int pi) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(i < pi) queue.add(arr[i]);
            else st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(st.size() > 0) arr[i] = st.pop();
            else arr[i] = queue.poll();
        }

        return arr;
    }
}
