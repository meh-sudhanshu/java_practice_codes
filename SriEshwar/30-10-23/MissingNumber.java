

class MissingNumber{
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {2,1,4,3,7,6,9,10,8};
        int ans = 0;
        for(int i=1;i<=n;i++) ans = ans^i;
        for(int e : arr){
            ans = ans ^ e;
        }
        System.out.println(ans);

    }
}