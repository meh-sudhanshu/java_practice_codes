package stack;

public class CustomStackImpl {
    public static void main(String[] args) {
        int[] stack = new int[10];
        int front = 0 ,rear = 0;
        // calling push and updating front as well as rear value
        stack = push(stack,10,front,rear);
        front++;
        rear = front-1;

        stack = push(stack,20,front,rear);
        front++;
        rear = front-1;


        stack = pop(stack,front,rear);
        if(front != 0){
            rear--;
            front--;
        }

        printStack(stack, rear);
    }
    public  static  int[] push(int[] stack, int value, int front , int rear){
        if(front > stack.length-1){
            System.out.println("Overflow");
            return stack;
        }
        stack[front] = value;
        return  stack;
    }

    public static int[] pop(int[] stack , int front , int rear){
        if(front == 0){
            System.out.println("underflow");
            return stack;
        }
            System.out.println(stack[rear]);
        return stack;
    }

    public static int top(int[] st, int front, int rear){
        if(front == 0){
            System.out.println("empty stack");
            return Integer.MIN_VALUE;
        }
        return st[rear];
    }
    public static int size(int[] stack , int front, int rear){
        if(front == 0) return  0;
        return  rear+1;
    }


    public static void printStack(int[] st , int rear){
        for(int i=0;i<=rear;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

}
