
public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {2,2,6,6,7,7,1,1,7,7,8,8,26,22};
        int uniqueNumbersXor = 0;
        for(int i=0;i<arr.length;i++)
            uniqueNumbersXor = uniqueNumbersXor^arr[i];
        int firstSetBitPos = getFirstSetBitPosition(uniqueNumbersXor);
        int ans1 = 0, ans2 = 0;
        for(int i=0;i<arr.length;i++){
            int currentElement = arr[i];
            if(getIthBit(currentElement,firstSetBitPos) == 1){
                ans1 = ans1 ^ currentElement;
            }else{
                ans2 = ans2^currentElement;
            }
        }
        System.out.println(ans1+" "+ans2);
    }

    private static int getIthBit(int n, int i) {
        n = n >>(i-1);
        return n%2;
    }

    private static int getFirstSetBitPosition(int n) {
        if (n ==0) {
            return -1;
        }
        int ans = 1;
        while (n%2 !=1) {
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
}
