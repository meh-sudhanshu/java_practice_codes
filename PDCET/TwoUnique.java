public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,2,7,9,3,9,15};
        int[] ans = getBothUniqueNumber(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }

    private static int[] getBothUniqueNumber(int[] arr) {
        int collectiveXor = 0;
        int[] ans = {0,0};
        for(int e: arr) collectiveXor = collectiveXor^e;
        int firstSetBitPos = getFirstSetBitPos(collectiveXor);
        for(int e : arr){
            int currentBit = getBitAtPos(e,firstSetBitPos);
            if (currentBit == 1) {
                ans[0] = ans[0]^e;
            }else{
                ans[1] = ans[1]^e;
            }
        }

        return ans;
    }

    private static int getBitAtPos(int e, int n) {
        return ((e>>(n-1)) % 2 == 1 ? 1:0);
    }

    private static int getFirstSetBitPos(int n) {
        int ans = 1;
        while (n%2 == 0) {
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
}
