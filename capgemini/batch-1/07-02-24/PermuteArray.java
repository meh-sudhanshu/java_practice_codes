import java.util.ArrayList;

public class PermuteArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ans = permute(arr);
        System.out.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 1){
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(arr.get(0));
            ans.add(curr);
            return ans;
        }
       
        for(int i=0;i<arr.size();i++){
            int fixedElement = arr.get(i);
            ArrayList<Integer> clonedArr = (ArrayList<Integer>) arr.clone();
            clonedArr.remove(fixedElement);
            ArrayList<ArrayList<Integer>> permutedArr = permute(clonedArr);
            for(ArrayList<Integer> currP : permutedArr){
                currP.add(fixedElement);
                ans.add(currP);
            }
        }

        return ans;
    }
}
