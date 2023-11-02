

public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {3,-4,13,7,-9,16,-3,-5,4};
        System.out.println(kadanes(arr));
    }

    private static int kadanes(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int i = 1;
        int cs = arr[0];

        while (i< arr.length) {
            if(arr[i]>=0){
                cs+=arr[i];
            }else{
                
                cs+=arr[i];
            }
            ans = Math.max(ans,cs);

            if(cs < 0) cs = 0;
            i++;
        }

        return ans;
    }
}
