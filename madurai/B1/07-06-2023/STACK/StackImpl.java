
import java.util.ArrayList;


class StackImpl{
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        var size = myStack.getSize();
        System.out.println(size);
        myStack.push(10);
        size = myStack.getSize();
        System.out.println(size);       
    }
    static class MyStack{
        static ArrayList<Integer> arr = new ArrayList<>();
        public static int getSize(){
            return arr.size();
        }
        public static void push(int e){
            arr.add(e);
        }
        public static Object pop(){
            if(arr.size() > 0){
                return arr.remove(0);
            }
            return "UNDERFLOW";
        }
    }
}