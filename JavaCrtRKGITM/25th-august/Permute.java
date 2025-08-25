
import java.util.*;

class Permute{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
    public static ArrayList<ArrayList<Integer>> permute(int[] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.length == 1){
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(arr[0]);
            ans.add(curr);
            return ans;
        }
        for(int i = 0; i< arr.length; i++){
            int fe = arr[i];
            int[] ss = new int[arr.length-1];
            int index = 0;
            for(int j = 0; j< arr.length; j++){
                if(i !=j){
                    ss[index++] = arr[j];
                }
            }
            ArrayList<ArrayList<Integer>> all =  permute(ss);
            for(int k = 0; k < all.size(); k++){
                ArrayList<Integer> curr = all.get(k);
                curr.add(fe);
                ans.add(curr);
            }
        }
        return ans;
    }
}