class MissingNumber{
    public static void main(String[] args){
        int n = 10;
        int[] arr = {1,4,2,3,5,7,8,9,10};
        int ans = 0;
        for(int i = 1;i <=n;i++){
            ans = ans ^ i;
        }
        for(int e : arr){
            ans = ans^e;
        }
        System.out.println(ans);
    }
}

// arr = {2,5,7,2,7,9,9,6,,9,8,9,8,6}