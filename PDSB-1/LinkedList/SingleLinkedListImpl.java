import java.util.Arrays;
import java.util.Stack;

public class SingleLinkedListImpl {
    static class Node{
        int value;
         Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node start;
        start = createLinkedList();
        printList(start);
        start = rotateList(start, 3);
        printList(start);
        int numberValue = convertToNumber(start);
        System.out.println(numberValue+" number value");

        //start = reverseLinkedList(start);
        //printList(start);

        //int size = getSize(start);
        //System.out.println(size);

        //printMedian(start);

        //start = sortList(start);
        //printList(start);

    }

    public static int convertToNumber(Node start){
        String ans = "";
        while(start !=null){
            ans+=start.value;
            start = start.next;
        }

        return Integer.parseInt(ans);
    }

    public static Node rotateList(Node start, int k){
        Node temp1 = start;
        Node temp3 = null;
        int length = getSize(start);
        int counter = length-k-1;
        while(counter !=0){
            temp1 = temp1.next;
            counter--;
        }
        Node temp2 = temp1.next;
        temp1.next = null;

        while(temp2 != null){
            temp3 = temp2;
            temp2 = temp2.next;
            temp3.next = start;
            start = temp3;
        }
        return start;
    }

    public static Node sortList(Node start){
        int size = getSize(start);
        int[] arr = new int[size];
        Node temp = start;
        int index = 0;
        while (temp != null){
            arr[index] = temp.value; index++; temp=temp.next;
        }
        Arrays.sort(arr);   temp = start;   index = 0;
        while (temp != null){
            temp.value = arr[index]; index++;   temp= temp.next;
        }

     return start;



    }






    public static void printMedian(Node start){
        int size = getSize(start);
        if (size == 0){
            System.out.println("EMPTY LIST");
        }else {
            int counter = size/2;
            for (int i=1;i<counter;i++) start = start.next;
            if(size%2 == 0){
                System.out.println("Median value "+(start.value + start.next.value)/2);
            }else{
                System.out.println("Median value "+ start.next.value);
            }
        }
    }




    public static int getSize(Node start){
        int count = 0;
        while (start!= null){
            count++;
            start = start.next;
        }
        return count;
    }




    public static Node reverseLinkedList(Node start){
        Node temp = start;
        Stack<Integer> st = new Stack<>();
        while (temp != null){
            st.push(temp.value);
            temp = temp.next;
        }
        temp = start;
        while (temp != null){
            temp.value = st.pop();
            temp = temp.next;
        }
        return start;
    }

    public static void printList(Node start){
        if(start == null){
            System.out.println("Empty List");
        }
        while (start.next != null){
            System.out.print(start.value+" ");
            start = start.next;
        }
        System.out.println(start.value);
    }


    public static Node createLinkedList(){
        Node start = null;
        Node temp = null;
        for(int i=1;i<5;i++){
            //int min = 11 , max = 56;
            //double randomValue = (int) (max-min)*Math.random()+1;
            //System.out.println((int)Math.floor(randomValue));
            //Node temp_node = new Node((int)Math.floor(randomValue));
            Node temp_node = new Node(i);
            if(start == null){
                start = temp_node;
                temp = start;
            }else{
                temp.next = temp_node;
                while (temp.next != null) temp = temp.next;
            }
        }

        return  start;
    }
}
