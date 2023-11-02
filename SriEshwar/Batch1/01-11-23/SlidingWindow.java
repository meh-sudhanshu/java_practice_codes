public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-23,3,2,-4,-26,76,45,-90,111};
        int ws = 3;
        int i=0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int ps = 0;
        while (j<arr.length) {
            if(i==0){
                for(int k=i;k<=j;k++){ps+=arr[k];}
                ans = ps;
            }else{
                int cs = ps - arr[i-1]+arr[j];
                ans = Math.max(ans, cs);
                ps = cs;
            }
            i++;j++;
        }
        System.out.println(ans);
    }
}
