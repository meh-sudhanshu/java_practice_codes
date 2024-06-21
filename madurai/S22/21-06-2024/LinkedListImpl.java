class LinkedListImpl{

    static class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data =data;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,4,2,7,8,4};
        Node start = generateList(arr);
        printList(start);
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