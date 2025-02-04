public class PolymorphismImpl {
    static class Multiply{
        Multiply(){}
        Multiply(int a, int b){System.out.println(a*b);}
        Multiply(int a, int b, int c){System.out.println(a*b*c);}
        Multiply(int a, int b, int c,int d){System.out.println(a*b*c*d);}
        Multiply(int... arr){
            int ans = 1;
            for(int i = 0; i< arr.length; i++){
                // ans = ans*arr[i];
                ans*=arr[i];
            }
            System.out.println(ans);
        }
    }

    static class  Animal {
        public String isDangerous(){
            return "Only Humans are dangerous !!";
        }
    }
    static class Dog extends Animal {
        @Override
        public String isDangerous(){
            return "No, dogs are cute !!";
        }
    }
    public static void main(String[] args) {
        PolymorphismImpl myParentObj = new PolymorphismImpl();
        Multiply myObj = new Multiply();
        myObj = new Multiply(10,20);
        myObj = new Multiply(10,20,30);
        myObj = new Multiply(10,20,30,40,50,60,70,80);

        Animal myAmimalObj = new Dog();
    }

}
