class Test{
    static class Animal{
        int numberOfLegs;
        int numberOfEyes;
        String typeOfAnimal;

        Animal(int numberOfLegs, int numberOfEyes, String typeOfAnimal){
            this.numberOfLegs = numberOfLegs;
            this.typeOfAnimal = typeOfAnimal;
            this.numberOfEyes = numberOfEyes;
            System.out.println("constructor has been executed");
        }   
    }
    public static void main(String[] args) {
        Animal parrot = new Animal(2,3,"Parrot");
        System.out.println(parrot.numberOfEyes+" "+parrot.numberOfLegs+" "+parrot.typeOfAnimal); 

        Animal cow = new Animal(4,2,"Cow");
        System.out.println(cow.numberOfEyes+" "+cow.numberOfLegs+" "+cow.typeOfAnimal); 

    }
}