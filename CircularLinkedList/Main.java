public class Main {
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,6,6,7,8};
        Node start = null;
        start = convertToCircularList(arr);
        printList(start);
        start = addToStart(start);
    }

    public static Node addToStart(Node start){
        return null;
    }

    public static Node addToEnd(Node start){
        return null;
    }

    public static Node addAfter(Node start){
        return null;
    }

    public static void printList(Node start){
        Node temp = start;
        while(temp.next != start){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }



    public static Node convertToCircularList(int[] arr){
        Node temp = null;
        Node start = temp;
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            if(i==0){
                temp = new Node(val);
                temp.next = start;
                start = temp;
            }else{
                temp.next  = new Node(val);
                temp = temp.next;
                temp.next = start;
            }

        }
        return start;

    }
}
