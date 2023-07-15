import java.util.LinkedList;
import java.util.Queue;

class QueueImpl{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<10;i++){
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.size());
    }
   
}