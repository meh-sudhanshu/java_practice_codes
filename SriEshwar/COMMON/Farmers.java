package COMMON;

public class Farmers {
    public static void main(String[] args) {
        int n  = 5;
        int ans = 0;
        int[] pXor = new int[n+1];
        pXor[1] = 1;
        for(int i=2;i<n+1;i++){
            pXor[i] = pXor[i-1]^(i);
        }
        for(int e : pXor){
            ans+=e;
        }
        System.out.println(ans);
    }
}
