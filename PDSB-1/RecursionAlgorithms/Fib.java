public class Fib {
    public static void main(String[] args) {
        int n = 5;
        int sum = getSumOfFirstNFibonaciNumber(n);
        System.out.println(sum);
    }

    private static int getSumOfFirstNFibonaciNumber(int n) {
        int first = 0, second = 1;
        int ans = 1;
        for(int i=3;i<=n;i++){
            int next = getNextFibonaciNumber(first,second);
            first = second;
            second = next;
            ans+=next;
        }  
        
        return ans;
    }
    private static int getNextFibonaciNumber(int first, int second) {
        return first+second;
    }
}
