package LinkedList;

import java.util.Random;

public class DoubleLinkedList {

    static  class Node{
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node start = null;
        start = createList(start);
        printList(start);
        int beforeValue = getBefore(7,start);
        System.out.println(beforeValue);
        int afterValue = getAfter(4,start);
        System.out.println(afterValue);
    }

    public static int getBefore(int value, Node start){
        if (start.value == value) return -1;
        while (start != null){
            if(start.value == value){
                return start.prev.value;
            }
            start = start.next;
        }
        return  -1;
    }
    public static int getAfter(int value, Node start){
        if (start.next == null) return -1;
        while (start != null){
            if(start.value == value){
                return start.next.value;
            }
            start = start.next;
        }
        return  -1;
    }





    public static void printList(Node start){
        if(start == null){
            System.out.println("Empty List");
        }else{
            while (start != null){
                System.out.print(start.value+" ");
                start = start.next;
            }
            System.out.println();
        }

    }




    public static Node createList(Node start){
        int max = 10, min = 1;
        Node temp = null;
        for(int i=1;i<=10;i++){
            Random rand = new Random();
            int randomValue = rand.nextInt(max-min+1)+min;
            Node tempNode = new Node(randomValue);
            if(start == null){
                start = tempNode;
                temp = start;
            }else{
                temp.next = tempNode;
                temp.next.prev = temp;
                temp = temp.next;
            }
        }
        return start;
    }




}
