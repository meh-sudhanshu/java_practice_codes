import java.util.ArrayList;

public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = {2,2,6,7,3,3,7,89,6,45};
        int ansXor = 0;
        for(int e : arr) ansXor = ansXor^e;
        int firstSetBitPosition = getFirstSetBitPosition(ansXor);
        ArrayList<Integer> segment1 = new ArrayList<>();
        ArrayList<Integer> segment2 = new ArrayList<>();
        for(int e : arr){
            if(isIthBitSet(e,firstSetBitPosition)){
                segment1.add(e);
            }else{
                segment2.add(e);
            }
        }
        System.out.println(segment1);
        System.out.println(segment2);

    }
    public static boolean isIthBitSet(int n,int i){
        return ((n>>(i-1))%2 == 1);
    }
    public static int getFirstSetBitPosition(int n){
        int ans = 1;
        while (n%2 != 1) {
            n = n >>1;
            ans+=1;
        }
        return ans;
    }
}
