import java.util.ArrayList;

public class TwoUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,6,7,11,6,9,11,16,9};
        int ansXor = 0;
        for(int e : arr) ansXor = ansXor^e;
        int setBitPosition = getSetBitPosition(ansXor);
        ArrayList<Integer> segment1 = new ArrayList<>();
        ArrayList<Integer> segment2 = new ArrayList<>();

        for(int e : arr){
            if(isIthBitSet(e,setBitPosition)){
                segment1.add(e);
            }else{
                segment2.add(e);
            }
        }

       int ans1 = 0;
       int ans2 = 0;

       for(int e : segment1) ans1 = ans1^e;
       for(int e : segment2) ans2 = ans2^e;

       System.out.println(ans1+" "+ans2);

    }

    public static boolean isIthBitSet(int n , int i){
        n = n>>(i-1);
        return (n%2 == 1);
    }

    private static int getSetBitPosition(int ansXor) {
        for(int i=1;i<=32;i++){
            if(ansXor % 2 == 1){
                return i;
            }
            ansXor = ansXor >>1;
        }
        return 0;
    }
}
