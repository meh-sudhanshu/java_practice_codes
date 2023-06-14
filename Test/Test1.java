import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        String str="[[]]{}({})[]";
        Stack <Character> stack =new Stack<>();
        for(int i=0;i<str.length();i++)
        {   char c = str.charAt(i);
            if(c=='['|| c=='('||c=='{')
                stack.push(c);
            else if(c == ']'){
                char curentChar = stack.pop();
                if(curentChar != '['){
                    System.out.println(false);
                    break;
                }
            }
            else if(c== ')'){
                 char curentChar = stack.pop();
                if(curentChar != '('){
                    System.out.println(false);
                    break;
                }
            }
            else if(c== '}'){
             char curentChar = stack.pop();
                if(curentChar != '{'){
                    System.out.println(false);
                    break;
                }
            }

            

        }

    }
    
}
