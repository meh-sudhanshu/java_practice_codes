class SlidingWindow{
    public static void main(String[] args) {
        int[] arr = {-1,2,3,24,-32,43,2,23,-34,54,12};
        int ws = 4;
        System.out.println(slidingWindow(arr,ws));
    }

    private static int slidingWindow(int[] arr, int ws) {
        int i = 0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int cs = 0;
        int ps = 0;

        while (j<arr.length) {
            if(i == 0){
                for(int k=i;k<=j;k++) cs+=arr[k];
                ps = cs;
            }else{
                cs = ps - arr[i-1]+arr[j];
                ps = cs; 
            }
            i++;
            j++;
            ans = Math.max(ans, cs);
        }


        return ans;
    }
}