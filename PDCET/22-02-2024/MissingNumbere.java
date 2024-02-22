

public class MissingNumbere {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,2,1,3};
        int ans = 0;
        for(int i=1;i<=n;i++) ans = ans^i;
        for(int e : arr) ans=ans^e;
        System.out.println(ans);
    }
}
