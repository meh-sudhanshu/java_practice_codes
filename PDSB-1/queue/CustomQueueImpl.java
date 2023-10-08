package queue;

public class CustomQueueImpl {
    public static void main(String[] args) {
        int[] queue = new int[10];
        int front = 9, rear = 9;

        queue = add(queue,100,front,rear);
        front--;

        queue = add(queue,101,front,rear);
        front--;

        queue = add(queue,102,front,rear);
        front--;

        printQueue(queue,front,rear);

        queue = remove(queue,front,rear);
        front++;

        printQueue(queue,front,rear);
    }

    public static int[] add(int[] queue, int value, int front , int rear){
        if (front <0){
            System.out.println("overflow");
            return queue;
        }
        queue[front] = value;
        return queue;
    }
    public static void printQueue(int[] queue, int front, int rear){
        for(int i = front+1;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static int[] remove(int[] queue, int front, int rear){
        if(front == rear){
            System.out.println("underflow");
            return queue;
        }
        for(int i= rear; i>=front+1;i--){
            queue[i] = queue[i-1];
        }
        return queue;
    }
}
