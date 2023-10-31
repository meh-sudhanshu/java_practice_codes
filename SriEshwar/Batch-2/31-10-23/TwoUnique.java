import java.util.ArrayList;

public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {12,1,2,2,13,1,7,13,12,9};
        int ansXor = 0;
        for(int e : arr) ansXor = ansXor^e;
        int firstSetBitPosition = getFirstSetBitPosition(ansXor);
        ArrayList<Integer> segment1 = new ArrayList<>();
        ArrayList<Integer> segment2 = new ArrayList<>();
        for(int e : arr){
            if(isIthBitSet(e, firstSetBitPosition)){
                segment1.add(e);
            }else{
                segment2.add(e);
            }
        }
        System.out.println(segment1);
        System.out.println(segment2);
    }

    private static int getFirstSetBitPosition(int ansXor) {
        int ans = 1;
        while (ansXor % 2 != 1) {
            ansXor = ansXor >> 1;
            ans+=1;
        }
        return ans;
    }

    private static boolean isIthBitSet(int n, int i) {
        return ((n>>i-1)%2 == 1);
    }
}
