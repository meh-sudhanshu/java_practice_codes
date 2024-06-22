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

    public static Node addAtFirst(Node start, char value){
        Node newNode = new Node(value);
        if(start == null){
            start = newNode;
        }else{
            newNode.next = start;
            start = newNode;
        }
        return start;
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

    public static char getIntersectionpoint(Node list1, Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        char ans = '0';
        while(temp1 != null && temp2 != null){
            char ch1 = temp1.data;
            char ch2 = temp2.data;
            if(ch1 == ch2){
                if(ans == '0'){
                    ans = ch1;
                }
            }else{
                ans = '0';
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return ans;
    }

    public static void main(String[] args){
        char[] arr1 = {'m','a','l','a','t','a','l','a','t','m'};
        char[] arr2 = {'m','p','l','t','y','a','l','a','t','m'};
        // Node start = createList(arr);
        // System.out.println("list at the begining");
        // printList(start);
        // System.out.println();
        // start = addAtFirst(start,'L');
        // System.out.println("list after adding an element");
        // printList(start);
        // boolean ans = isPalindromic(start);
        // System.out.println("is list palindromic --> "+ ans);

        // start = reverseList(start);
        // printList(start);

        Node list1 = createList(arr1);
        Node list2 = createList(arr2);
        char ch = getIntersectionpoint(list1,list2);
        System.out.println("intersection point is "+ ch);
    }
}