

class StockTrading{
     public static void main(String[] args){
        int[] arr = {3,8,2,7,11,0,2,33,9,6,54,3,9};
        int ans = getMaxProfit(arr);
        System.out.println(ans);
    }
    public static int getMaxProfit(int[] arr){
        int n = arr.length;
        int[] suffix = new int[n];
        for(int i = n-1; i>=0 ; i--){
            if(i == n-1) suffix[i] = arr[n-1];
            else suffix[i] = Math.max(arr[i],suffix[i+1]);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            int profit = suffix[i] - arr[i];
            if(profit > ans) ans = profit;
        }
        return profit;

    }
}