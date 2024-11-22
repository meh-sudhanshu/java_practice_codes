public class Subsequence {
    public static void main(String[] args) {
        String str = "madam";
        int index = 0;
        String ans = "";
        printSubsequence(str,index,ans);
    }
    private static void printSubsequence(String str, int index, String ans){
       
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        //if(index >= str.length()) return;
        printSubsequence(str, index+1, ans);
        printSubsequence(str, index+1, ans+str.charAt(index));

        // ans = ans + str.charAt(index);
        // printSubsequence(str, index+1,ans);
        //ans = ans.substring(0,ans.length()-1);
        // printSubsequence(str, index+1, ans);
    }
}
