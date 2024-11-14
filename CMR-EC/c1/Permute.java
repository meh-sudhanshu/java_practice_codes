import java.util.ArrayList;

class Permute{
    public static void main(String[] args) {
        String str = "pot";
        ArrayList<String> arr = permute(str);
        System.out.println(arr);
    }
        
    private static ArrayList<String> permute(String str) {
       ArrayList<String> ans = new ArrayList<>();
       if (str.length() == 1) {
            ans.add(str);
            return ans;
       }
       for(int i = 0; i< str.length();i++){
            char curr = str.charAt(i);
            String currSubSequence = "";
            for(int j=0;j<str.length();j++){
                if (i != j) {
                    currSubSequence+=str.charAt(j);
                }
            }
            ArrayList<String> allPermutation = permute(currSubSequence);
            for(int j=0;j<allPermutation.size();j++){
                ans.add(allPermutation.get(j)+curr);
            }
       }

       return ans;
    }
}