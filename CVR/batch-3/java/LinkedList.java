import java.util.Stack;

public class LinkedList {
    static class Node{
        int value;
        Node next;
        Node(int val){
            value = val;
        }
    }
    public static void main(String[] args) {
        Node start = null;
        Node temp = start;
        for(int i=1;i<=10;i++){
            Node node = new Node(i);
            if(i==1){
                start = node;
                temp = start;
            }else{
                temp.next = node;
                temp = temp.next;
            }
        }
        temp = start;

        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.value);
            temp = temp.next;
        }
        temp = start;
        while(temp != null){
            temp.value = stack.pop();
            temp = temp.next;
        }

        temp = start;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}
