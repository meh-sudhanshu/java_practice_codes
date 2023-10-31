

public class MissingNumber {
    public static void main(String[] args) {
        int n  = 10;
        int[] arr = {1,3,5,2,4,8,9,10,6};

        int ans = 0;

        for(int i=1;i<=n;i++) ans = ans ^ i;

        for(int e : arr) ans = ans^e;

        System.out.println(ans);
    }
}
