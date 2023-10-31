
public class Block {
        static {
            System.out.println("static block");
        }
    public static void main(String[] args) {
         {
            System.out.println("Instance Block");
        }
        if(true){
            System.out.println("inside local block");
        }
        
        System.out.println("main lock");
       
    }
}
