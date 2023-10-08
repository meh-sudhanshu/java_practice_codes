package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=10;i++){
            queue.add(i);
        }
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
