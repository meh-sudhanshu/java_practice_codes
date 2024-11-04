public class Queries {
    public static void main(String[] args) {
        int[] arr = {-5,-9,-2,4,4,-4,3,-5,66,-66,-45,46};
        int[][] queries = {{0,4},{2,3},{4,6}};
        int[] ps = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if (i == 0) {
                ps[i] = arr[i];
            }else{
                ps[i] = ps[i-1]+arr[i];
            }
        }
        // for(int[] q : queries){
        //     int si = q[0];
        //     int ei = q[1];
        // }

        for(int i=0;i<queries.length;i++){
            int[] q = queries[i];
            int si = q[0];
            int ei = q[1];
            if (si == 0) {
                System.out.println(ps[ei]);
            }else{
                System.out.println(ps[ei]-ps[si-1]);
            }
        }
    }
}
