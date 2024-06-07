import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(58);
        q.add(95);
        q.add(97);
        q.add(452);
        q.add(542);
        
        int k = 4;
        reversePartsOfQueue(q,k);
    }

    private static void reversePartsOfQueue(Queue<Integer> q, int k) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(k != 0){
            st1.push(q.remove());
            k-=1;
        }
        while(!q.isEmpty()) st2.add(q.remove());

        System.out.println(st1);
        System.out.println(st2);

        while(!st1.isEmpty()) q.add(st1.pop());
        while(!st2.isEmpty()) q.add(st2.pop());
        System.out.println(q);
    }
}
