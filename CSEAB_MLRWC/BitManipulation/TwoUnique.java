
public class TwoUnique {
    public static int getFirstSetBitPost(int n){
        int ans = 1;
        while (n%2 == 0) {
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
    public static int getIthBit(int n , int i){
        n = n >> (i-1);
        return n%2;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,3,7,16,8,16,19,2,19,8,6,2,8,6,15};
        int wholeXor = 0;
        for(int e : arr) wholeXor = wholeXor ^ e;
        int firstSetBitPost = getFirstSetBitPost(wholeXor);
        int ans1 = 0, ans2 = 0;
        for(int e : arr){
            if(getIthBit(e,firstSetBitPost) == 1){
                ans1 = ans1 ^ e;
            }else{
                ans2 = ans2 ^ e;
            }
        }
        System.out.println(ans1+" "+ans2);
    }
}
