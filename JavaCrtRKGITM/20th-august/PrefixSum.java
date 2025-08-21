

class PrefixSum{
    public static void main(String[] args){
        int[] arr = {-3,6,2,8,-3,-6,-5,34,56};
        int[][] queries = {{0,8},{4,8},{3,7},{2,6}};
        int n = arr.length;
        int[] prefixSum = new int[n]; 
        for(int i = 0; i< n; i++){
            if(i == 0){
                prefixSum[i] = arr[i];
            }else{
                prefixSum[i] = prefixSum[i-1]+arr[i];
            }
        }
        for(int[] query : queries){
            int si = query[0], ei =query[1];
            if(si == 0){
                System.out.print(prefixSum[ei]+" ");
            }else{
                System.out.print(prefixSum[ei] - prefixSum[si-1]+" ");
            }
        }
    }
}