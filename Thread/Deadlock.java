// import java.util.concurrent.ExecutionException;

// public class Deadlock {

//     static String name = "sudhanshu kumar";
//     static class ThreadDemo1 extends Thread{
//         public void run(){
//             try{
//                 for(int i=0;i<5;i++){
//                     System.out.println(name);
//                 }
//             }catch(Exception e){
//                 System.out.println("This resource is already occupied");            }
//         }
//     }
//     static class ThreadDemo2 extends Thread{
//         public void run(){
//             try{
//                 for(int i=0;i<5;i++){
//                     System.out.println(name);
//                 }
//             }catch(Exception e){
//                 System.out.println("This resource is already occupied");            }
//             }
//         }
//     public static void main(String[] args) {
//         ThreadDemo1 t1 = new ThreadDemo1();
//         ThreadDemo2 t2 = new ThreadDemo2();

//         t1.start();
//         t2.start();



// }
// }


class Test{
    static String firstName = "suhanshu";
    static String lastName = "kumar";
    static class Thread1 extends Thread{
        public void run(){
            synchronized(firstName){
                System.out.println("firstname is occupied by t1 "+firstName);
            }

            synchronized(lastName){
                System.out.println("lastname is occupied by t1 "+lastName);
            }
            }
        }
    
    static class Thread2 extends Thread{
        public void run(){
            synchronized(lastName){
                System.out.println("lastname is occupied by t1 "+lastName);
            }
            synchronized(firstName){
                System.out.println("firstname is occupied by t1 "+firstName);
            }
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}










