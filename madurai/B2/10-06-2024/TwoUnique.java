public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {5,5,6,6,9,8,9,13};
        int allXor = 0;
        for(int e : arr) allXor = allXor^e;
        int pos = getFirstSetBitPos(allXor);
        int ans1 = 0, ans2 = 0;
        for(int e : arr){
            int bitValue = getIthBit(e,pos);
            if(bitValue == 1) ans1 = ans1^e;
            else ans2 = ans2^e;
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static int getIthBit(int e, int i) {
        if((e >> (i-1)) %2 == 1) return 1;
        return 0;
    }

    private static int getFirstSetBitPos(int num) {
        if(num == 0) return -1;
        int ans = 1;
        while(num % 2 !=1){
            num = num>>1;
            ans+=1;
        }
        return ans;
        
    }
}
