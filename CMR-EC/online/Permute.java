
import java.util.*;
class Permute{
    public static void main(String[] args) {
        String str = "pot";
        ArrayList<String> ans = permute(str);
        System.out.println(ans);
    }
    private static ArrayList<String> permute(String str){
        ArrayList<String> ans = new ArrayList<>();
        if(str.length() == 1){
            ans.add(str);
            return ans;
        }
        for(int i =0; i< str.length();i++){
            char ch = str.charAt(i);
            String currentSubSequenceExcludingIndexI = "";
            for(int j = 0 ; j< str.length();j++){
                if(i != j){
                    currentSubSequenceExcludingIndexI+=str.charAt(j);
                }
            }
            //System.out.println("fixed char is "+ ch + " subsequence "+currentSubSequenceExcludingIndexI);
            ArrayList<String> currAllPermutation = permute(currentSubSequenceExcludingIndexI);
            for(int l =  0; l<currAllPermutation.size();l++){
                String curr = currAllPermutation.get(l);
                curr = ch + curr;
                ans.add(curr);
            }
        }
        return ans;
    }
}