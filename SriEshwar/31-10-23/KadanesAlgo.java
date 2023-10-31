public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr ={3,8,-17,6,8,-12,-15,18,22,-13,17};
        int ans = Integer.MIN_VALUE;
        int cs = 0;
        int i = 0;
        while (i<arr.length) {
            if(arr[i] < 0){
                ans = Math.max(ans, cs);
                cs += arr[i];
            }else if(arr[i] >=0) cs+= arr[i];

            if(cs < 0) cs = 0;
            i+=1;
            
        }
        System.out.println(Math.max(cs,ans));
    }
}
