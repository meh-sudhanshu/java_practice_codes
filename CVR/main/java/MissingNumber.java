class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int missingNumber = 0;

        for(int i=1;i<=n;i++){
            missingNumber = missingNumber^i;
        }

        for(int e : arr){
            missingNumber = missingNumber^e;
        }

        System.out.println(missingNumber);
    }
}