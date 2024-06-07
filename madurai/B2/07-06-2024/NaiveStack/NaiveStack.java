import java.util.ArrayList;

public class NaiveStack {
    public static void main(String[] sudhanshu) {
        //MyStack stack = new MyStack(10,20);
        // System.out.println(sudhanshu[0]);
        // System.out.println(sudhanshu[1]);
        
        MyStack stack = new MyStack();
        int size = stack.getSize();
        System.out.println(size);
    }

    static class MyStack{
         ArrayList<Integer> arr = new ArrayList<>();

        public int getSize(){
            return arr.size();
        }

        // public MyStack() {
        //     System.out.println("object has been created");
        // }
        // public MyStack(int a, int b) {
        //     System.out.println(a+b);
        // }
        
        
    }
}



//  https://tinyurl.com/klutest1
// password TO ACCESS TEST: KLU07062024