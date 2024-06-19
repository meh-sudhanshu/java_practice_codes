class SumOfSquare{
    public static void main(String[] args){
        int c = 675;
        int a = 0, b = (int)Math.sqrt(c);
        boolean ans = false;
        while( a< b){
            if((a*a)+(b*b) == c){
                ans = true;
                break;
            }
            if((a*a)+(b*b) < c){
                a+=1;
            }
            if((a*a)+(b*b) > c){
                b-=1;
            }
        }
        System.out.println(ans);
    }
}