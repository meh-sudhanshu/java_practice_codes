class TwoUnique{
    public static void main(String[] args) {
        int n = 20;
        int ans = getFirtsSetBitPosition(n);
        System.out.println(ans);
    }
    private static int getFirtsSetBitPosition(int n){
        int ans = 1;
        while (n %2 != 1) {
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
}