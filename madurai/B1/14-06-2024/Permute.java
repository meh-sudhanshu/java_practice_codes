import java.util.*;
class Permute{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(9);
        arr.add(11);
        ArrayList<ArrayList<Integer>> ans  = permuteArray(arr);
        System.out.println(ans);
    }
    private static ArrayList<ArrayList<Integer>> permuteArray(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 1){
            ans.add(arr);
            return ans;
        }
        for(int i=0;i<arr.size();i++){
            int fixedEle = arr.get(i);
            ArrayList<Integer> subSequence = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(i != j){
                    subSequence.add(arr.get(j));
                }
            }
            var allPermutation = permuteArray(subSequence);
            for(ArrayList<Integer> per : allPermutation){
                per.add(fixedEle);
                ans.add(per);
            }
        }
        return ans;
    }
}