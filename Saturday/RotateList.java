import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotateList {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        
    }
    private static Node rotateList(Node head, int k){
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();
        int count = 1;
        Node temp = head;
        while (temp != null) {
            if(count < k){
                qu.add(temp.value);
            }else{
                st.push(temp.value);
            }
            count+=1;
            temp = temp.next;
        }

        temp = head;

        while (st.size() > 0) {
            temp.value = st.pop();
            temp = temp.next;
        }

        while (qu.size() > 0) {
            temp.value = qu.poll();
            temp = temp.next;
        }

        return head; 
        
        
    }
}
