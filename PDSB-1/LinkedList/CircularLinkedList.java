import java.util.*;

class CircularLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node start = null;
        start = createList();
        printList(start);
        start = reverseList(start);
        printList(start);
    }

    public static Node reverseList(Node start){
        Stack<Integer> st = new Stack<>();
        Node temp = start;
        st.push(temp.data);
        temp = temp.next;
        while(temp != start){
            st.push(temp.data);
            temp = temp.next;
        }
        temp.data = st.pop();
        temp = temp.next;
        while(temp != start){
            temp.data = st.pop();
            temp = temp.next;
        }


        return start;
    }






    public static void printList(Node start){
        Node temp = start;
        System.out.print(temp.data+" ");
        temp = temp.next;
        while(temp != start){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }



    public static Node createList(){
        Node start = null;
        Node tempNode = null;
        for(int i=0;i<=10;i++){
            Node newNode =new Node(i);
            if(start == null){
                start = newNode;
                tempNode = newNode;
            }else{
                tempNode.next = newNode;
                tempNode = tempNode.next;
            }
        }
        tempNode.next = start;

        return start;
    }
}