public class Interface {
    interface Basics{
        void printSomething();
    }
    static class Test implements Basics{

        @Override
        public void printSomething() {
            System.out.println("inside test");
        }

    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.printSomething();
    }
}
