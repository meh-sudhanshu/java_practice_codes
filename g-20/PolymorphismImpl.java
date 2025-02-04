import java.util.Arrays;

class PolymorphismImpl{
    static class Multiply{
        public int multiply(int a, int b){
            return a*b;
        }
        public int multiply(int a, int b,int c){
            return a*b*c;
        }
        public int multiply(int... arr){
            int ans = 1;
            for(int ele : arr){
                ans*=ele;
                // ans = ans * ele;
            }
            //System.out.println(Arrays.toString(arr));
            return ans;
        }
    }

    static class Add{
        // Add(){}
        Add(int a, int b){
            System.out.println(a+b);
        }
        Add(int a, int b, int c){
            System.out.println(a+b+c);
        }
        Add(int... arr){

        }
    }

    static class  Animal {
        boolean canFly;
        public String name(){
            return "Human !!";
        }
    }
    static class  Dog extends Animal {
        @Override
        public String name(){
            return "Dog !!";
        }
    }

    public static void main(String[] args) {
        Multiply myObj = new Multiply();
        System.out.println(myObj.multiply(10, 20,30,2));
        System.out.println(myObj.multiply(10, 20));
        System.out.println(myObj.multiply(10, 20,30));

       // Add myAddObj = new Add();
        Add myAddObj = new Add(10,20);
        myAddObj = new Add(10,20,30);
       // myAddObj = new Add(10,20,30,40);
       Animal animalObj = new Animal();
    }
}