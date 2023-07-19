public class LinkedListImpl {
    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
    int[] arr = {1,2,4,3,5};
        Node start = generateList(arr);
        printList(start);
    }
    private static void printList(Node start) {
        while(start != null){
            System.out.print(start.value+" ");
            start = start.next;
        }
    }
    public static Node generateList(int[] arr){
        Node start = null;
        Node temp = start;

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
}
