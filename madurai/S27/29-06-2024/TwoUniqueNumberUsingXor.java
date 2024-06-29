import java.util.Arrays;

public class TwoUniqueNumberUsingXor {
    public static void main(String[] args) {
        int[] arr = {3,9,3,7,11,9,2,7};
        int[] ans = getBotUniqueNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getBotUniqueNumbers(int[] arr) {
       int wholeXor = 0;
       for(int e: arr) wholeXor = wholeXor^e;
       int firstSetBitPos = getFirstSetBitPos(wholeXor);
       int ans1 = 0, ans2 = 0;
       for(int e: arr){
            int bitValue = getIthBitValue(e,firstSetBitPos);
            if(bitValue == 1){
                ans1 = ans1 ^ e;
            }else{
                ans2 = ans2^e;
            }
       }
       int[] ans = new int[2];
       ans[0] = ans1;
       ans[1] = ans2;
       return ans;
    }

    private static int getIthBitValue(int num, int i) {
       return ((num >> (i-1)) % 2 ) == 1 ? 1 : 0;
    }

    private static int getFirstSetBitPos(int num) {
        int ans = 1;
        while( num%2 != 1){
            num = num>>1;
            ans+=1;
        }
        return ans;
    }
}
