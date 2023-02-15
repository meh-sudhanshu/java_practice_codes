
// class Main extends Thread{
//     public void run(){
//         System.out.println("Thread "+Thread.currentThread().getId()+" is running");
//     }


//     public static void main(String[] args) {
//         for(int i = 1;i<=5;i++){
//             Main t = new Main();
//             t.start();
//         }
//         for(int j=0;j<=5;j++){
//             System.out.println(j+"  ");
//         }
//     }
// }

class ThreadDemo implements Runnable{
    public void run(){
        System.out.println("current thread id is "+Thread.currentThread().getId());
    }
}
class Main{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread obj = new Thread(new ThreadDemo());
            obj.start();
        }

        for(int j=0;j<5;j++){
            System.out.println(j);
        }
    }
}

















