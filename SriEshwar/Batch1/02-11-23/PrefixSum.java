public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,24,-32,43,2,23,-34,54,12};
        int[][] queries = {{0,2},{2,4},{3,6}};
        int[] ps = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                ps[i] = arr[i];
            }else{
                ps[i] = arr[i]+ps[i-1];
            }
        }
        for(int[] query : queries){
            int si = query[0];
            int ei = query[1];
            System.out.print(ps[ei]-ps[si-1]);
        } 


    }
}
