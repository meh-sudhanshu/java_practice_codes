import java.util.*;
class LinkedListImpl{

    static class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data =data;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,8,8,7,6,5,3,2};
        Node start = generateList(arr);
        printList(start);
        System.out.print(isPalindrome(start));
    }

    public static boolean isPalindrome(Node start){
        Stack<Integer> st = new Stack<>();
        Node temp = start;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = start;
        while(temp != null){
            if(temp.data != st.pop()) return false;
            temp = temp.next;
        }
        return true;
    }

    public static Node generateList(int[] arr){
        Node start = null;
        Node temp = null;
        for(int e: arr){
            Node tempNode = new Node(e);
            if(start == null){
                start = tempNode;
                temp = start;
            }else{
                temp.next = tempNode;
                temp = temp.next;
            }
        }
        return start;
    }

    public static void printList(Node start){
        if(start == null){
            System.out.println("empty list");
        }else{
            while(start != null){
                System.out.print(start.data+" ");
                start = start.next;
            }
        }
    }
}