class SuffixSum{
    public static void main(String[] args) {
        int[] arr = {5,2,7,-8,6,-9,98,-25,32,14};
        int[][] queries = {{2,3},{3,6},{5,7},{0,9},{2,7}};
        printQueriesResult(arr,queries);
    }

    private static void printQueriesResult(int[] arr, int[][] queries) {
       int[] suffixSum = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        if(i == 0){
            suffixSum[i] = arr[i];
        }else{
            suffixSum[i] = arr[i] + suffixSum[i-1];
        }
       }
       for(int i=0;i<queries.length;i++){
            int[] query = queries[i];
            int si = query[0];
            int ei = query[1];

            if(si == 0){
                System.out.print(suffixSum[ei]+" ");
            }else{
                int ans = suffixSum[ei] - suffixSum[si-1];
                System.out.print(ans+" ");
            }
       }
    }
}