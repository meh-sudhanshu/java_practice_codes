import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        var ans = permute(arr);
        System.err.println(ans);
    }

    private static ArrayList<ArrayList<Integer>> permute( ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr.size() == 0){
            return ans;
        }
        if(arr.size() == 1){
            var currAns = new ArrayList<Integer>();
            currAns.add(arr.get(0));
            ans.add(currAns);
            return ans;
        }  
        for(int i=0;i<arr.size();i++){
            int fixedElement = arr.get(i);
            ArrayList<Integer> subSet = new ArrayList<>();
            for(int j=0;j<arr.size();j++){
                if(i!= j) subSet.add(arr.get(j));
            }
            var subSetPermutation = permute(subSet);
            for(ArrayList<Integer> currAns : subSetPermutation){
                currAns.add(0, fixedElement);
                ans.add(currAns);
            }
            
        

        }






        return ans;
    }
}
