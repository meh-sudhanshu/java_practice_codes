public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {2,8,3,2,16,36,16,3,7,9,7,9};
        int uniqueNumbersXor = 0;
        for(int i=0;i<arr.length;i++){
            uniqueNumbersXor = uniqueNumbersXor ^ arr[i];
        }
        int firstSetBitPosition = getFirstSetBitPosition(uniqueNumbersXor);
        int ans1 = 0, ans2 = 0;

        for(int i=0;i<arr.length;i++){
            int ithBit = getIthBit(arr[i],firstSetBitPosition);
            if (ithBit == 1) {
                ans1 =ans1 ^ arr[i];
            }else{
                ans2 = ans2^arr[i];
            }
        }
        System.out.println(ans1+" "+ans2);
    }
    private static int getIthBit(int n, int i) {
       n = n >> (i-1);
       if (n % 2 == 0) {
            return 0;
       }
       return 1;
    }
    private static int getFirstSetBitPosition(int n) {
        if (n == 0) {
            return -1;
        }
        int ans = 1;
        while (n %2 != 1) {
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
}
