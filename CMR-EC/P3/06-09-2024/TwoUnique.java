public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {10,3,6,11,10,34,65,26,34,11,3,6};
        int uniqueNumbersXor = 0;
        for(int e : arr)
            uniqueNumbersXor = uniqueNumbersXor^e;
        int firstSetBitPos = getFirstSetBitPosition(uniqueNumbersXor);
        int ans1 = 0, ans2 = 0;
        for(int e : arr){
            if(getIthBit(e,firstSetBitPos) == 1){
                ans1 = ans1^e;
            }
            else{
                ans2 = ans2 ^ e;
            }
        }
        System.out.println(ans1+" "+ans2);
    }

    private static int getFirstSetBitPosition(int n) {
       if (n == 0) {
        return -1;
       }
       int ans = 1;
       while (n%2 != 1) {
            n = n>>1;
            ans+=1;
       }
       return ans;
    }

    private static int getIthBit(int n, int i) {
        n = n >> (i-1);
        return n%2;
    }
}
