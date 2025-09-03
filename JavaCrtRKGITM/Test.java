public class Test {
    public static void main(String[] args) {
        // String name = "sudhanshu";
        // pass(name);
        // System.out.println(name);
        int n = 10;
        if(n%2 == 1){
            System.out.println("odd");
        }else{
            for(int i = 0; i< 10; i++){
                if(false){
                    System.out.println("Will never execute");
                }else{
                    break;
                }
                System.out.println("Outsiude");
            }
        }
    }
    // public static void pass(String name){
    //     name+="kumar";
    // }
}
