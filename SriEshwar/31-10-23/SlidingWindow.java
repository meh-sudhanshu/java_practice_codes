

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr ={3,8,-17,6,8,-12,-15,18,22,-13,17};
        int ws = 3; 
        int i = 0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int ps = 0;
        while (j < arr.length) {
            int cs = 0;
            if(i==0){
                for(int k=i;k<=j;k++) cs+=arr[k];
            }else{
                cs = ps - arr[i-1]+arr[j];
            }
            ans = Math.max(ans,cs);
            ps = cs;
            i++;
            j++;
        }
        System.out.println(ans);
    }
}
