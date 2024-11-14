public class Fib {
    public static void main(String[] args) {
        int n = 10;
        int p1= 0, p2 = 1;
        if (n <= 2) {
            if (n == 1) {
                System.out.println(0);
            }else if(n == 2){
                System.out.println(0+" "+1+" ");
            }
        }else{
            System.out.print(0+" "+1+" ");
            for(int i =3; i<=n ; i++){
                int next = p1+p2;
                System.out.print(next+" ");
                p1 = p2;
                p2 = next;
            }
        }
    }
}
