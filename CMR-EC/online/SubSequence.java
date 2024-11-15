import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {2,3,7};
        int index = 0;
        printSubSequence(arr,index,new ArrayList<>());
    }
    private static void printSubSequence(int[] arr, int index, ArrayList<Integer> curr){
        if(index == arr.length){
            System.out.println(curr);
            return;
        }
        curr.add(arr[index]);
        printSubSequence(arr, index+1, curr);
        curr.remove(curr.size()-1);
        printSubSequence(arr, index+1, curr);
        
    }
}
