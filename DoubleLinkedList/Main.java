import Main;
import Main.Node;
package DoubleLinkedList;

public class Main {
    static class Node{
        Node prev, next;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node start = new Node(1);
        printList(start);
        addToEnd(start, 2);
        addToEnd(start, 3);
        addToEnd(start, 4);
        addToEnd(start, 5);
        start = addToStart(start, -1);
        printList(start);
    }

    public static Node addToStart(Node start , int val){
        Node temp = start;
        if(temp == null){
            temp = new Node(val);
            return temp;
        }else{
            temp.prev = new Node(val);
            temp.prev.next = start;
            temp = start.prev;
        }

        return temp;
    }

    public static void addToEnd(Node start , int val){
        Node temp = start;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        temp.next.prev = temp;
    }
    public static void printList(Node start){
        Node temp = start;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

        System.out.println();
    }
}
