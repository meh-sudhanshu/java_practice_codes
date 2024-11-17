public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {3,8,17,3,8,7,19,19};
        int wholeXor = 0;
        for(int e : arr) wholeXor = wholeXor ^ e;
        int firstSetBitPos = getFirstSetBitPosition(wholeXor);
        int ans1 = 0 , ans2 = 0;
        for(int e : arr){
            int ithBit = getIthBit(e,firstSetBitPos);
            if (ithBit == 1) {
                ans1 = ans1 ^ e;
            }else{
                ans2 = ans2 ^ e;
            }
        }
        System.out.println(ans1+" "+ans2);
    }
    private static int getFirstSetBitPosition(int n){
        int ans = 1;
        while (n %2 != 1) {
            n = n >> 1;
            ans+=1;
        }
        return ans;
    }
    private static int getIthBit(int n , int i){
        n = n >> (i-1);
        if (n % 2 == 0) {
            return 0;
        }
        return 1;
    }
}
