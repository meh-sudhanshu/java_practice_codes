class MinimumPatches{
    public static void main(String[] args){
        int[] arr = {2,4,9,12,18};
        int n = 20;
        int sumTillNow = 0, nextSum = 1;
        int patchCount = 0;
        int i = 0;
        while(sumTillNow < n){
            if(i < arr.length && arr[i] <= nextSum){
               sumTillNow+=arr[i];
               nextSum = sumTillNow+1;
               i+=1;
            }else{
                sumTillNow+=nextSum;
                nextSum = sumTillNow+1;
                patchCount+=1;
            }
        }
        System.out.println(patchCount);
    }
}