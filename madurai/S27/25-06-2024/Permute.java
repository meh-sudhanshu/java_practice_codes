import java.util.*;
class Permute{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        ArrayList<ArrayList<Integer>> ans = permuterArray(arr);
        System.out.println(ans);
    }
    public static ArrayList<ArrayList<Integer>> permuterArray(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 1){
            ans.add(arr);
            return ans;
        }
        for(int i=0;i<arr.size();i++){
            int fixedEle = arr.get(i);
            ArrayList<Integer> subSequence = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(i!=j) subSequence.add(arr.get(j));
            }
            var allPermutation = permuterArray(subSequence);
            for(ArrayList<Integer> per : allPermutation){
                per.add(fixedEle);
                ans.add(per);
            }
        }

        return ans;
    }
}