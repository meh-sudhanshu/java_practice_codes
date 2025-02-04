class InheritanceImpl{
    static class Animal{
        boolean isAlive = true;
    }
    static class Dog extends Animal{
        int numberOfLegs = 4;
    }
    static class Cat extends Animal{
        boolean isCute = true;
    }
    static class StrayDogs extends Dog{
        boolean isImportant = true;
    }
    public static void main(String[] args) {
        Dog myObj = new Dog();
        System.out.println(myObj.numberOfLegs);
        System.out.println(myObj.isAlive);

        Animal animalObj = new Dog();
        System.out.println(animalObj.isAlive);
    }
}

/*
 
byte->short->int->long->float->double




 */