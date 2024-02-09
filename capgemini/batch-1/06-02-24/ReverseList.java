import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseList {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        int pp = 4;
        head = reverseList(head,pp);
    }
    private static ReverseList.Node reverseList(ReverseList.Node head, int pp) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            if (pp-1 != 0) {
                queue.add(temp.value);
                pp--;
            }else{
                stack.push(temp.value);
            }
        }
        temp = head;

        while (stack.size() != 0) {
            temp.value = stack.pop();
            temp = temp.next;
        }
        while (queue.size() != 0) {
            temp.value = queue.remove();
            temp = temp.next;
        }


        return head;
    }
}
