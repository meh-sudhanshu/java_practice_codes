package stack;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        printStack(st);
        for(int i=1;i<=10;i++) st.push(i);
        printStack(st);
        System.out.println(st.pop());
        printStack(st);
        System.out.println(st.peek());
        printStack(st);
        System.out.println(st.size());
    }
    public static void printStack(Stack<Integer> st){
        for(int e : st){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
