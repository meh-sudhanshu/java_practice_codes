public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,24,-32,43,2,23,-34,54,12};
        int i = 1;
        int cs = arr[0];
        int ans = Integer.MIN_VALUE;
        while (i<arr.length) {
            if(arr[i] >= 0){
                cs += arr[i];
                ans = Math.max(ans, cs);
            }
            else{
                ans = Math.max(ans, cs);
                cs+= arr[i];
            }
            if(cs < 0) cs = 0;
        }


        System.out.println(Math.max(ans, cs));
    }
}
