

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 389702;
        int sum = 0;
        while (n > 0) {
            int mod = n%10;
            sum += mod;
            n = n /10;
        }
        System.out.println(sum);
    }
}
