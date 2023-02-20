import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        // myQueue.add(10);
        // myQueue.add(9);
        // myQueue.add(-1);
        // myQueue.add(-15);
        // myQueue.add(90);
        // printList(myQueue);

        // System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());

        // PriorityQueue<String> myQueue = new PriorityQueue<>();

        PriorityBlockingQueue<String> myQueue = new PriorityBlockingQueue<>();

        myQueue.add("a");
        myQueue.add("a");
        myQueue.add("a");
        myQueue.add("d");
        myQueue.add("e");
        myQueue.add("ab");
        myQueue.add("ac");
        
        
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());


    }

    public static void printList(PriorityQueue<Integer> myQueue){
        for(int e:myQueue){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
