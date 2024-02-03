public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {-3,4,-5,7,8,-9,12,-7};
        int k = 3;
        int ans = Integer.MIN_VALUE;
        int i=0, j= k-1;
        int previousSum = 0;
        while (j <arr.length-1) {
            int currSum = 0;
            if (i==0) {
                for(int l=i;l<=j;l++){
                    currSum+=arr[l];
                }
                ans = Math.max(ans, currSum);
                previousSum = currSum;
            }else{
                currSum = previousSum - arr[i-1]+arr[j];
                ans=Math.max(ans, currSum);
                previousSum = currSum;
            }
            i++;
            j++;
        }
        System.out.println(ans);
        
    }
}
