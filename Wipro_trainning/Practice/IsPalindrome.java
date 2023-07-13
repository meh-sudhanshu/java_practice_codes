package Practice;
import java.util.Stack;
public class IsPalindrome {
   public static void main(String[] args) {
        String str = "abbas";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        System.out.println(isPalindrome(str,st));
   }

    private static boolean isPalindrome(String str, Stack<Character> st) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != st.pop()){
                return false;
            }
        }

        return true;
    }
}
