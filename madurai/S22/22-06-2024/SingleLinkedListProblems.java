import java.util.*;
class SingleLinkedListProblems{

    static class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data =data;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {2,3,5,6,7,8,8,7,6,5,3,2};
        int[] arr2 = {2,3,4,6,9,8,6,7,6,5,3,2};
        Node list1 = generateList(arr1);
        Node list2 = generateList(arr2);
        int intersectionPoint = getIntersectionPoint(list1,list2);
        System.out.println(intersectionPoint);
        // Node start = generateList(arr);
        // printList(start);
        // System.out.print(isPalindrome(start));
    }


    public static int getIntersectionPoint(Node list1, Node list2){
        Node t1 = list1;
        Node t2 = list2;
        int ans = -1;
        while( t1 != null && t2!= null){
            if(t1.data == t2.data){
                if(ans == -1){
                    ans = t1.data;
                }
            }else{
                if(ans != -1){
                    ans = -1;
                }
            }
            t1=t1.next;
            t2=t2.next;
        }
        return ans;
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