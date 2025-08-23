
import java.util.*;

class TwoUnique{
    public static void main(String[] args){
        int[] arr = {3,2,6,7,24,95,6,95,7,3,2,9};
        int wholeXor = 0;
        for(int i = 0; i< arr.length; i++) wholeXor ^= arr[i];
        int fsbpos = getFirstSetBitPos(wholeXor);
        int ans1 = 0;
        int ans2 = 0;
        // List<Integer> seg1 = new ArrayList<>();
        // List<Integer> seg2 = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            int ele = arr[i];
            if(getIthBit(ele,fsbpos) == 1){
                ans1^=ele;
            }else{
                ans2^=ele;
            }
        }
        
        // for(int i = 0 ; i < seg1.size(); i++) ans1 ^= seg1.get(i);
        // for(int i = 0 ; i < seg2.size(); i++) ans2 ^= seg2.get(i);
        System.out.print(ans1+" "+ans2);
    }
    public static int getFirstSetBitPos(int n){
        if(n == 0) return -1;
        int ans = 1;
        while(n%2 == 0){
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
    public static int getIthBit(int n, int i){
        n = n>>(i-1);
        return n%2;
    }
}