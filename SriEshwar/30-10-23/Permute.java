import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = permute(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() < 1){
            return ans;
        }
        if(arr.size()== 1){
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(arr.get(0));
            ans.add(curr);
            return ans;
        }
        for(int i=0;i<arr.size();i++){
            int fixedElement =arr.get(i);
            ArrayList<Integer> subarray = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(j!=i) subarray.add(arr.get(j));
            }
            ArrayList<ArrayList<Integer>> subarrayPermutation = permute(subarray);
            for(ArrayList<Integer> curr_arr : subarrayPermutation){
                curr_arr.add(0, fixedElement);;
                ans.add(curr_arr);
            }
        }




        return ans;
    }
}
