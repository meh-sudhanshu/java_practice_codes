class InheritanceImpl{
    static class Animal{
        boolean isAlive = true;
        //private boolean isHarmful = false;
    }
    static class Dog extends Animal{
        int numberOfLegs = 4;
    }
    static class Cat extends Animal{
        boolean isCute = true;
    }
    static class GoldenRetriever extends Dog{

    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.isAlive);
        System.out.println(animal.toString());
    }
}