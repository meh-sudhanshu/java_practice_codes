class TwoUnique{
    public static void main(String[] args){
        int[] arr = {1,8,9,1,8,7,6,3,7,3,6,7};
        int allXor = 0;
        int ans1 = 0, ans2 = 0;
        for(int e : arr) allXor = allXor^e;
        int bitPosition = getFirstSetBit(allXor);
        for(int e : arr){
           if (isIthBitSet(e,bitPosition)){
                ans1 = ans1^e;
           }else{  
                ans2 = ans2^e;
           }
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static int getFirstSetBit(int n){
        if(n<=0){
            return 0;
        }
        int ans = 1;
        while(n%2 !=1){
            n = n>>1;
            ans+=1;
        }
        return ans;
    }
    public static boolean isIthBitSet(int n, int i){
        n = n>>(i-1);
        return (n%2 == 1);

    }
}