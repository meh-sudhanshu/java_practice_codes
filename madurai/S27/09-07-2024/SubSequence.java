import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> currSubsequence = new ArrayList<>();
        printAllSubsequene(arr,0,currSubsequence);
    
    }
    private static void printAllSubsequene(int[] arr, int i, ArrayList<Integer> currSubsequence) {
        if(i == arr.length){
            System.out.println(currSubsequence);
            return;
        }
        currSubsequence.add(arr[i]);
        printAllSubsequene(arr, i+1, currSubsequence);

        currSubsequence.remove(currSubsequence.size()-1);
        printAllSubsequene(arr, i+1, currSubsequence);
    }
}
