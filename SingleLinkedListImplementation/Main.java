

public class Main {
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,7,8};
        Node start;
        start = convertToLinkedList(arr);
        printLinkedList(start);
        System.out.println();
        start = addToStart(10,start);
        printLinkedList(start);
        System.err.println();
        start = deleteFirstNode(start);
        printLinkedList(start);
        System.out.println();
        start = deleteFirstNode(start);
        printLinkedList(start);
        System.out.println();
        start = deleteAtEnd(start);
        printLinkedList(start);
        System.out.println();
        start = deleteValue(1 , start);
        printLinkedList(start);
        System.out.println();
    }

    public static Node deleteValue(int val,Node start){
        Node temp = start;
        if(temp.value == val){
            start = start.next;
            return start;
        }

        while(temp.next.value != val){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return start;
    }


    public static Node deleteAtEnd(Node start){
        if(start == null){
            System.out.println("linked list is empty");
        }
        Node temp = start;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;


        return start;
    }




    public static Node deleteFirstNode(Node start){
        if(start == null){
            System.err.println("linked list is empty");
        }else{
            start = start.next;
        }

        return start;
    }

    public static Node addToStart(int val , Node start){
        if(start == null){
            start = new Node(val);
            return start;
        }
        Node temp = new Node(val);
        temp.next = start;
        start = temp;

        return start;


    }
    

    public static void printLinkedList(Node start){
        if(start == null){
            System.out.println("no elements are present");
            return;
        }
        
        while(start !=null)
        {
            System.out.print(start.value+" ");
            start = start.next;
        }
    }


    public static Node convertToLinkedList(int[] arr){
        Node start = null;

        for(int e:arr){
            start = addToEnd(e , start);
        }
        return start;
    }

    public static Node addToEnd(int val , Node start){
        Node temp = start;
        if(temp == null){
            temp = new Node(val);
            return temp;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);

        return start;
    }


}
