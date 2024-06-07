import java.util.*;

class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.remove(0);
        queue.peek();
        queue.size();
    }
}