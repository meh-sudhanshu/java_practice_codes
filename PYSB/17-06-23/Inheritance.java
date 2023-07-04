public class Inheritance {
    static class Animal{
        int numberOfLegs = 10;
        // Animal(){
        //     this.numberOfLegs = 2;
        // }
    } 
    static class Parrot extends Animal{
       int numberOfEyes = 2;
    }
    static class Bird extends Parrot{
    }
    static class Bird2 extends Parrot{
    }
    public static void main(String[] args) {
        // Parrot parrot = new Parrot();
        // System.out.println(parrot.numberOfLegs);
        Bird bird = new Bird();
        System.out.println(bird.numberOfEyes+" "+bird.numberOfLegs);
    }
}
