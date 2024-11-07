import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequesnce {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 0;
        ArrayList<Integer> curr = new ArrayList<>();
        print(arr,index,curr);
    }
    private static void print(int[] arr,int index, ArrayList<Integer> curr){
        
        if(index == arr.length){
            System.out.println(curr);
            return;
        }
        curr.add(arr[index]);
        print(arr, index+1, curr);
        curr.remove(curr.size()-1);
        print(arr, index+1, curr);
    }
}
