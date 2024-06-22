import java.util.*;
class SingleLinkedListProblems{

    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data  = data;
            this.next = null;
        }
    }


    public static Node createList(char[] arr){
        Node start = null;
        Node temp = null;
        for(char e : arr){
            if(start == null){
                start = new Node(e);
                temp = start;
            }else{
                temp.next = new Node(e);
                temp = temp.next;
            }
        }
        return start;
    }

    public static void printList(Node start){
        while(start != null){
            System.out.print(start.data+" ");
            start = start.next;
        }
    }

    public static boolean isPalindromic(Node start){
        Stack<Character> st = new Stack<>();
        Node temp = start;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = start;
        while(temp != null){
            char ch = st.pop();
            if(ch != temp.data) return false;
            temp = temp.next;
        }
        return true;
    }

    public static Node reverseList(Node start){
        Stack<Character> st = new Stack<>();
        Node temp = start;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = start;
        while(temp != null){
            char ch = st.pop();
            temp.data = ch;
            temp = temp.next;
        }
        return start;
    }

    public static void main(String[] args){
        char[] arr = {'m','a','l','a','y','a','l','a','t','m'};
        Node start = createList(arr);
        boolean ans = isPalindromic(start);
        System.out.println("is list palindromic --> "+ ans);

        start = reverseList(start);
        printList(start);
    }
}