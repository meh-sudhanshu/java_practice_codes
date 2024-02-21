import java.util.Stack;

public class ValidPara {
    public static void main(String[] args) {
        String str = "(((())))))()";
        boolean ans = isValid(str);
        System.out.println(ans);
    }

    private static boolean isValid(String str) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ')'){
                if(st.size() == 0) return false;
                st.pop();
            }else{
                st.push('(');
            }
        }

        return st.size() == 0;
    }
}
