public class Pin {
    public static void main(String[] args) {
        int n1=9854,n2=543,n3=98432,n4=98;
        if(n4%2 !=0){
            int ans = callOdd(n1,n2,n3);
        }else{
            
        }
    }

    private static int callOdd(int n1, int n2, int n3) {
        int ans = 0;
        while(n1!=0){
            if(((n1%10)%2) != 0){
                ans+=n1%10;
            }
            n1=n1/10;
        }
        while(n2!=0){
            if(((n2%10)%2) != 0){
                ans+=n2%10;
            }
            n2=n2/10;
        }
        while(n3!=0){
            if(((n3%10)%2) != 0){
                ans+=n3%10;
            }
            n3=n3/10;
        }
        return 0;

    }
}
