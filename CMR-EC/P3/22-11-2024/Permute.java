import java.util.ArrayList;

class Permute{
    public static void main(String[] args) {
        String str = "pot";
        ArrayList<String> ans = permute(str);
        System.out.println(ans);
    }

    private static ArrayList<String> permute(String str){
        ArrayList<String> ans = new ArrayList<>();
        int n = str.length();
        if(n == 1){
            ans.add(str);
            return ans;
        }

        for(int i = 0; i < n; i++){
            char ch  = str.charAt(i);
            String currSubsequence = "";
            for(int j = 0; j<n;j++){
                if(i != j){
                    currSubsequence+= str.charAt(j);
                }
            }
            var allPermutation = permute(currSubsequence);
            for(int k = 0; k< allPermutation.size();k++){
                var curr = allPermutation.get(k);
                curr = ch + curr;
                ans.add(curr);
            }
        }

        return ans;
    }


}