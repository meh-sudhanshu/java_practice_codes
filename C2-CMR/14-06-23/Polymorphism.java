public class Polymorphism {
    static class TestPloymorphism{
        public void printomething(){
            System.out.println("Inside Test Polymorphism class");
        }
    }
    static class Child extends TestPloymorphism{
        @Override
        public void printomething(){
            System.out.println("Inside children class");
        }
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printomething();
    }
}
