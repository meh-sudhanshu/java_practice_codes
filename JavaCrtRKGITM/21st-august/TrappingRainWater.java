

class TrappingRainWater{
    public static void main(String[] args){
        int[] arr = {0,4,2,7,2,8,4,9,4,1};
        int ans = getAmountOfWaterTrapped(arr);
        System.out.println(ans);
    }
    public static int getAmountOfWaterTrapped(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int ans = 0;
        for(int i = 0; i< n; i++) 
            if(i == 0) prefix[i] = arr[i];
            else prefix[i] = Math.max(prefix[i-1],arr[i]);

        for(int i = n-1; i>=0 ; i--){
            if(i == n-1) suffix[i] = arr[i];
            else suffix[i] = Math.max(suffix[i+1],arr[i]);
        }
        for(int i = 0; i< n; i++){
            int amount = Math.min(prefix[i],suffix[i]) - arr[i];
            ans+=amount;
        }
        return ans; 
    }
}