public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,9,3,7,6};
        int[][] queries = {{0,3},{1,5},{3,4},{2,5}};
        int[] prefix_sum = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i == 0) prefix_sum[i] = arr[i];
            else{
                prefix_sum[i] = prefix_sum[i-1]+arr[i];
            }
        }
        for(int i = 0;i<queries.length;i++){
            int si = queries[i][0];
            int ei = queries[i][1];
            if (si == 0) {
                System.out.print(prefix_sum[ei]);
            }else{
                System.out.print(prefix_sum[ei]-prefix_sum[si-1]);
            }
        }
    }
}
