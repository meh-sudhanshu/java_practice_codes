

public class MissingNumber {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7,1,2,4,3,6,8,10,9};

        int ans = 0;
        for(int i=1;i<=n;i++) ans = ans^i;
        for(int e : arr) ans = ans^e;
        System.out.println(ans);
    }
}
