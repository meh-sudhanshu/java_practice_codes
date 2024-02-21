import java.util.Stack;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != st.pop()) return false;
        }
        return st.size() == 0;
    }
}
