
import java.util.*;


class Subsequence{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        printAllSubsequence(arr,0,ans);
    }
    public static void printAllSubsequence(int[] arr,int i , ArrayList<Integer> ans){

        if(i == arr.length){
            System.out.println(ans);
            return;
        }
        printAllSubsequence(arr,i+1,ans);
        ans.add(arr[i]);
        printAllSubsequence(arr,i+1,ans);
        ans.remove(ans.size()-1);
        
    }
}