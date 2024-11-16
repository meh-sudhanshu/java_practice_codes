import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        String str = "pot";
        var ans = permute(str);
        System.out.println(ans);
    }

    private static ArrayList<String> permute(String str){
        ArrayList<String> ans = new ArrayList<>();
        if(str.length() == 1){
            ans.add(str);
            return ans;
        }
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            String currSub = "";
            for(int j = 0; j < str.length(); j++){
                if (i != j) {
                    currSub += str.charAt(j);
                }
            }
            var allPermutation = permute(currSub);
            for(int k = 0; k< allPermutation.size(); k++){
                var currString = allPermutation.get(k);
                currString = ch + currString;
                ans.add(currString);
            }
        }



        return ans;
    }
}
