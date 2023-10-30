public class IsIthBitSet {
    public static void main(String[] args) {
        int n = 86;
        int i = 6;
        System.out.println(checkIthBit(n,i));
    }

    public static boolean checkIthBit(int n , int i){
        n = n>>(i-1);
        return (n%2 == 1);
    }
}
