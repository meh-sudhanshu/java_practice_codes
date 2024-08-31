class MissingNumber{
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1,7,10,8,9,3,2,5,6};
        int ans = getMissingNumber(arr,n);
        System.out.println(ans);
    }
    private static  int getMissingNumber(int[] arr, int n){
        int missingNumber = 0;
        for(int i=1;i<=n;i++)
            missingNumber = missingNumber ^ i;
        for(int e : arr)
            missingNumber = missingNumber ^ e;

        return missingNumber;
    }
}