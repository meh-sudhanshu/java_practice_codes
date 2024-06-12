import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        var result = permuteArray(arr);
        System.out.println(result);
    }

    private static ArrayList<ArrayList<Integer>> permuteArray(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 1){
            ans.add(arr);
            return ans;
        }
        for(int i=0;i<arr.size();i++){
            int fixedElement = arr.get(i);
            ArrayList<Integer> subSequence = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(i!=j) subSequence.add(arr.get(j));
            }
            var allPermutation = permuteArray(subSequence);
            for(int k=0;k<allPermutation.size();k++){
                allPermutation.get(k).add(fixedElement);
            }
            for(int k=0;k<allPermutation.size();k++){
                ans.add(allPermutation.get(k));
            }
        }
        return ans;
    }
}
