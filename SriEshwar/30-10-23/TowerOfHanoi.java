public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3 ;
        char src = 'A', aux = 'B', des = 'C';

        toh(n,src,des,aux);
    }

    private static void toh(int n, char src, char des, char aux) {
        if(n<1) return;
        toh(n-1, src, aux, des);
        System.out.println("move "+src+"->"+des);
        toh(n-1, aux, des, src);
    }
}
