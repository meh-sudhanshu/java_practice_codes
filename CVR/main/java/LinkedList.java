import java.util.ArrayList;
import java.util.Stack;

class LinkedList{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,16,-30};
        Node start = createList(arr);
        int n = 2;
        ArrayList<Integer> al = new ArrayList<>();
        Node temp = start;
        while(temp != null){
            if(temp.val%2 != 0){
                al.add(temp.val);
            }
            temp = temp.next;
        }

        int index = al.size() - n;
        System.out.println(al.get(index));

        // Node temp = start;
        // while(temp != null){
        //     System.out.print(temp.val+" ");
        //     temp = temp.next;
        // }

        // System.out.println();
        // temp = start;
        // while(temp.next.next != null){
        //     temp = temp.next;
        // }
        // System.out.println("second last element is "+temp.val);
        // temp = temp.next;
        // System.out.println("last element is "+temp.val);
        
        // start = reverseList(start);
        // temp = start;
        // System.out.println("reverse list is");
        // while(temp != null){
        //     System.out.print(temp.val+" ");
        //     temp = temp.next;
        // }
    }

    private static Node reverseList(Node start){
        Stack<Integer> st = new Stack<>();
        Node temp = start;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        temp = start;
        while(temp != null){
            temp.val = st.pop();
            temp = temp.next;
        }
        return start;
    }

    private static Node createList(int[] arr) {
        Node start = null;
        Node currentPointer = start;
        for(int i=0;i<arr.length;i++){
            int currentValue = arr[i];
            Node tempNode = new Node(currentValue);
            if(start == null){
                start = tempNode;
                currentPointer = start;
            }else{
                currentPointer.next = tempNode;
                currentPointer = currentPointer.next;
            }
       }
       return start;
    }
}