public class TOH {
    public static void main(String[] args) {
        char src = 'A', des = 'C', aux = 'B';
        int n = 3;
        toh(src,des,aux,n);
    }

    private static void toh(char src, char des, char aux, int n) {
        if (n<=0) {
            return;
        }
        toh(src, aux, des, n-1);
        System.err.println(src+"->"+des);
        toh(aux, des, src, n-1);
    }
}
