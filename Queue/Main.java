import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> queue = new ArrayList<>();
        push(1,queue);
        push(2,queue);
        push(3,queue);
        printQueue(queue);
        pop(queue);
        printQueue(queue);
        printSize(queue);
    }


    public static void printSize(ArrayList<Integer> queue){
        System.out.println("The current size of queue is "+queue.size());
    }

    public static void pop(ArrayList<Integer> queue){
        if(queue.size() == 0){
            System.out.println("queue is empty");
        }
        else
            System.out.println("removed value is "+queue.remove(0));
    }


    public static int top(ArrayList<Integer> queue){
        return queue.get(0);
    }

    public static void push(int value,ArrayList<Integer> queue){
        queue.add(value);
    }

    public static void printQueue(ArrayList<Integer> queue){
        for(int e : queue){
            System.out.print(e+" ");
        }
        System.out.println();
    }

}
