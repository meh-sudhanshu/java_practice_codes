


class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,8,1,9,5,10};
        int n = 10;
        int missingNumber = getMissingNumber(arr,n);
        System.out.println(missingNumber);
    }
    private static int getMissingNumber(int[] arr, int n){
        int missingNumber = 0;
        for(int i = 1; i<=n;i++){
            missingNumber = missingNumber ^ i;
        }
        for(int i=0;i<arr.length;i++){
            missingNumber = missingNumber^arr[i];
        }
        return missingNumber;
    }
}