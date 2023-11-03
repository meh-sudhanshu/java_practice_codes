

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {-1,10,23,43,23,54,5,3,4,5};
        int[][] queries = {{0,3},{2,5},{4,6}};
        int[] ps = new int[arr.length];
        for(int i=0;i<arr.length;i++) 
            if(i==0) 
                ps[i] = arr[i]; 
            else 
                ps[i] = arr[i]+ps[i-1];
        for(int[] query : queries){
            int si = query[0], ei = query[1];
            System.out.println(ps[ei]-ps[si-1]);
        }
    }
}
