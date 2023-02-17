import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack.empty());
        System.out.println(stack.size());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack.size());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        stack.addAll(arr);
        System.out.println(stack.size());
    }
}
