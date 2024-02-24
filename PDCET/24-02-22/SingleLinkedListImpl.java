import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SingleLinkedListImpl{
    static class Node{
        int data;
        Node next;
        Node(int value){
            data = value;
        }

    }
    public static void main(String[] args) {
        int[] arr = {87,87,87,89,-23,87,87,45,90,1,6,45,87,87,87,90,7,90,87,89,87,90,87,87};
        Node start = createList(arr);
        // printList(start);
        // System.out.println();
        // start = reverseList(start);
        // printList(start);
        // System.out.println();
        // float median = getMedian(start);
        // System.out.println((int)median+" meadian");
        printList(start);
        System.out.println();
        start = deleteAllOccurence(start, 87);
        printList(start);
    }
    private static Node createList(int[] arr) {
        Node start = null;
        Node temp = null;
        for(int i=0;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            if(i == 0){
                start = newNode;
                temp = start;
            }else{
                temp.next = newNode;
                temp = temp.next;
            }
        }

        return start;
    }
    public static void printList(Node start){
        while (start != null) {
            System.out.print(start.data+" ");
            start = start.next;
        }
    }
    public static Node reverseList(Node start){
        Node temp = start;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = start;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }

        return start;
    }
    public static float getMedian(Node start){
        int length = getLength(start);
        int ans = 0;
       
        if(length %2 == 1){
            for(int i=1;i<=length/2;i++){
                start = start.next;
            }
            return start.data;
        }else{
            for(int i=1;i<=length/2-1;i++){
                start = start.next;
            }
            return (start.data + start.next.data)/2;
        }
    }





    public static int getLength(Node start){
        int ans = 0;
        while (start != null) {
            start = start.next;
            ans+=1;
        }
        return ans;
    }
    public static Node deleteAllOccurence(Node start, int value){
        Queue<Integer> q = new LinkedList<>();
        Node temp = start;
        while (temp != null) {
            if(temp.data != value) q.add(temp.data);
            temp = temp.next;
        }
        System.out.println(q.toString()+" queue");
        temp = start;
        while (q.size() > 0) {
            int v = q.poll();
            temp.data = v;
            temp= temp.next; 
        }
        temp.next = null;
        System.out.println("list");
        printList(start);
        System.out.println();
        return start;
    }
}



// ans = 1
// ans = ans+1
// ans+=1
// ans++

// 1,2,5,8,4,9,13,15,67,34