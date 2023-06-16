public class Abstract {
    abstract class Test{
       abstract void printSomething();
    }
    static class Test2 extends Test{
        void printSomething() {
           System.out.println("inside Test2");
        }
        
    }
    public static void main(String[] args) {
        Test obj  = new Test2();
        obj.printSomething();
    }
}
