class MissingNumber{
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {4,1,2,6,9,10,8,7,5};
        int ans = getMissingNumber(arr,n);
        System.out.println(ans);
    }
    private static int getMissingNumber(int[] arr, int n){
        int missingNumber = 0;
        for(int i=1;i<=n;i++)
            missingNumber = missingNumber ^ i;
        for(int i=0;i<arr.length;i++)
            missingNumber = missingNumber ^ arr[i];
        return missingNumber;
    }
}