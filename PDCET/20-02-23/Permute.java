import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ArrayList<ArrayList<Integer>> ans = permute(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 1){
            ans.add(arr);
            return ans; 
        }
        for(int i=0;i<arr.size();i++){
            int fixedElement = arr.get(i);
            ArrayList<Integer> currentList = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(i!=j){
                    currentList.add(arr.get(j));
                }
            }
            ArrayList<ArrayList<Integer>> allPermutation = permute(currentList);
            for(ArrayList<Integer> p : allPermutation){
                p.add(fixedElement);
                ans.add(p);
            }
        }

        return ans;
    }
}
