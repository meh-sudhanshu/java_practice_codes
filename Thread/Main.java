public class Main {

    public static class Test extends Thread{
        public void run(){
            System.out.println("my thread is running");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
