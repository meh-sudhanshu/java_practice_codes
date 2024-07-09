import java.util.ArrayList;

public class SubSquence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> current = new ArrayList<>();
        printAllSubsequence(arr,0,current);
    }

    private static void printAllSubsequence(int[] arr, int i, ArrayList<Integer> current) {
        if(i == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[i]);
        printAllSubsequence(arr, i+1, current);
        current.remove(current.size()-1);
        printAllSubsequence(arr, i+1, current);

    }
}
