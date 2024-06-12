class Operator{
    public static void main(String[] args) {
        int a = 10;
        if(a++ >= 10 && a++ < 10){
            a = 30;
        }
        System.out.println(a);
    }
}