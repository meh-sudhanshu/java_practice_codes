class InheritanceImpl{

    static class Animal{
        String isDangerous = "Only Humans are dangerous !!";
        boolean isAlive = true;
    }
    static class Dog extends Animal{
        String isDangerous = "Dogs are cute !!";
    }
    static class Cat extends Animal{

    }
    static class GoldenRetriever extends Dog{

    }
    public static void main(String[] sudhanhsu) {
        System.out.println(sudhanhsu[0]);
        System.out.println(sudhanhsu[1]);
        System.out.println(sudhanhsu[2]);
        Animal myDog = new Dog();
        Dog myDog2 = new Dog();
        System.out.println(myDog.isDangerous);
        System.out.println(myDog2.isDangerous); 
    }
}


/*
 
byte -> short -> int -> long -> float->double



 */