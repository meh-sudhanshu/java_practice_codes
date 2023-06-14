public class Inheritance {
    static class Car{
        int numberOfTyres; 
        int numberOfEngine;
    }
    static class SpecialCar{

    }
    static class Model1 extends Car{
        public Model1(int a, int b){
            this.numberOfEngine = a;
            this.numberOfTyres = b;
        }
    }
    public static  void main(String[] args) {
        Model1 myCar1 = new Model1(2,3);
        Model1 myCar2 = new Model1(4,5);
        System.out.println(myCar1.numberOfTyres);
        System.out.println(myCar2.numberOfTyres);
        
    }
}
