public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {-1,4,-34,2,-5,76,90};
        int[][] queries={
            {1,3},
            {2,4},
            {3,6},
            {0,6}
        };
        printQueriesResult(arr,queries);
    }

    private static void printQueriesResult(int[] arr, int[][] queries) {
        int[] ps = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                ps[i] = arr[i];
            }else{
                ps[i] = ps[i-1]+arr[i];
            }
        }

        for(int[] query : queries){
            int si = query[0];
            int ei = query[1];
            if(si == 0){
                System.out.print(ps[ei]+" ");
            }else{
                System.out.print(ps[ei]-ps[si-1]+" ");
            }
        }
    }
}
