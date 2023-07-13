import java.util.Stack;

class StackImpl{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<10;i++){
            st.push(i);
        }
        System.out.println(st.size());
        printStack(st);
        st.push(-1);
        printStack(st);
        System.out.println("pop ope gets executed"+st.pop());
        System.out.println("pop ope gets executed"+st.pop());
        printStack(st);
    }
    public static void printStack(Stack<Integer> st){
        for(int e : st){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}