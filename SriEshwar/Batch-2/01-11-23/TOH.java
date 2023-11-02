public class TOH {
    public static void main(String[] args) {
        int n = 3;
        char src ='A', des = 'C', aux = 'B';
        toh(n,src,des,aux);
    }
    private static void toh(int n, char src, char des, char aux) {
        if(n<1) return;
        toh(n-1,src,aux,des);
        System.out.println(src+"->"+des);
        toh(n-1, aux, des, src);
    }
}
