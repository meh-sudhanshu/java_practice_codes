public class Polymorphism {
    static class Test{
        public  int returnInteger(){
            return 10;
        }
    }
    static class Test2 extends Test{
        @Override
        public  int returnInteger(){
            return 30;
        }
    }
    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println(test.returnInteger());
    }
}
