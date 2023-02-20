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
        start = deleteFromStart(start);
        printList(start);
        start = deleteFromEnd(start);
        printList(start);
        start = addAfter(3, 5, start);
        printList(start);
        start = deleteAfter(3
        , start);
        printList(start);
    }

    public static Node deleteAfter(int val1,Node start){
        // implement to delete a node just after val1
        Node temp = start;
        while(temp.val != val1){
            temp = temp.next;
        }

        temp.next = temp.next.next;


        return start;

    }

    public static Node addAfter(int val1 , int val2 , Node start){
        Node temp  = start;

        while(temp.val != val1){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = new Node(val2);
        temp.next.next = temp2;


        return start;
    }


    public static  Node deleteFromEnd(Node start){
        Node temp = start;
        if(start == null){
            System.out.println("nothing to delete");
            return start;
        }else if(temp.next == null){
            temp = null;
            return temp;
        }
        else
        {
            while(temp.next.next !=null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return start;
    }

    public static Node deleteFromStart(Node start){
        if(start == null){
            System.out.println("nothing to delete");
        }else{
            start = start.next;
            start.prev = null;
        }

        return start;
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
