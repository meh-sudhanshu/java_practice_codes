class LinkedListImpl{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
            this.next = null;
        }
    }


    public static Node createList(int[] arr){
        Node start = null;
        Node temp = null;
        for(int e : arr){
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

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Node start = createList(arr);
        printList(start);
    }
}