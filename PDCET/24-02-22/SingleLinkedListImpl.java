class SingleLinkedListImpl{
    static class Node{
        int data;
        Node next;
        Node(int value){
            data = value;
        }

    }
    public static void main(String[] args) {
        int[] arr = {89,-23,45,1,6,45,90};
        Node start = createList(arr);
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
}