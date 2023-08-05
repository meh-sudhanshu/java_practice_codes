public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-3,44,8,2,9,-45,34,98};
        int k = 3;
        int i = 0, j = k-1;
        int ans = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;
        while(j < arr.length){
            if(i==0){
                currentSum =0;
                for(int m = i; m<=j;m++){  
                    currentSum+=arr[m];
                }
                ans = currentSum;
                i++;
                j++;
            }else{
                currentSum = currentSum - arr[i-1] + arr[j];
                if(currentSum > ans){
                    ans = currentSum;
                }
                i++;
                j++;
            }
        } 
        System.out.println(ans);  
    }
}
