import java.util.Stack;

public class IsValid2 {
    public static void main(String[] args) {
        String str = "{[]()}";
        Stack<Character> st = new Stack<>();
        int flag = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }else if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    System.out.println(false);
                    flag = 1;
                    break;
                }
            }else if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    System.out.println(false);
                    flag  = 1;
                    break;
                }
            }else if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    System.out.println(false);
                    flag =1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println(true) ;
        }
    }
}
