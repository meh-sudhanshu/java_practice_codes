

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
    }
    

    public static void printLinkedList(Node start){
        if(start == null){
            System.out.println("no elements are present");
            return;
        }
        
        while(start !=null)
        {
            System.out.println(start.value);
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
