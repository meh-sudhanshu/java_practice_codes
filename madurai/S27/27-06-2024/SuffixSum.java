class SuffixSum{
    public static void main(String[] args) {
        int[] arr = {3,-2,1,5,6,-9,-6,-7,23};
        int[][] queries = {{0,2},{3,5},{5,8},{3,6}};
        printQueriesResult(arr,queries);
    }

    private static void printQueriesResult(int[] arr, int[][] queries) {
        int[] suffixSum = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            if(i == 0){
                suffixSum[i] = arr[i];
            }else{
                suffixSum[i] = suffixSum[i-1]+arr[i];
            }
        }

        // for(int[] query : queries){

        // }
        for(int i=0;i<queries.length;i++){
            int[] query = queries[i];
            int si = query[0];
            int ei = query[1];
            if(si == 0){
                System.err.println(suffixSum[ei]);
            }else{
                System.out.println(suffixSum[ei]-suffixSum[si-1]);
            }
        }




    }
}