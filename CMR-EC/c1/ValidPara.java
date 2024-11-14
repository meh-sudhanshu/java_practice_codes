import java.util.Stack;

public class ValidPara {
    public static void main(String[] args) {
        String str = "((((()))";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
    private static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' ){
                st.push('(');
            }else{
                if(st.isEmpty()) return false;
                if(ch == ')' && st.peek() != '(') return false;
                if(ch == '}' && st.peek() != '{') return false;
                if(ch == ']' && st.peek() != '[') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
