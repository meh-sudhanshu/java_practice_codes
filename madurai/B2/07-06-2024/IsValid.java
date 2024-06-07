import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String str = "[[{{()()}}]()";
        boolean ans = checkValidity(str);
        System.out.println(ans);
    }

    private static boolean checkValidity(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch =='[' || ch == '{'){
                st.push(ch);
            }else if(ch == '}' && st.peek() != '{') return false;
            else if(ch == ']' && st.peek() != '[') return false;
            else if(ch == ')' && st.peek() != '(') return false;
            else st.pop();
        }

        return  st.isEmpty();
    }
}
