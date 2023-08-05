import java.util.Arrays;

class TargetSum{
    public static  void main(String[] args) {
        int[] arr = {1,-4,6,5,8,3,45,23,-67};
        int target = 29;
        isPairExists(arr,target);
    }
    public static boolean isPairExists(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return true; 
                }
            }
        }
        return false;
    }

    private static boolean optimizedSolution(int[] arr,int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target) return true;
            if(arr[i]+arr[j] > target) j--;
            if(arr[i]+arr[j] < target) i++;
        }  
        return false;
    }
    private static int findKSum(int[] arr, int k){
        int i =0 , j = k-1;
        int ans = Integer.MIN_VALUE;
        int cs = 0;
        while(j<arr.length){
            if(i==0){
                for(int k1=i;k1<=j;k1++){
                    cs+=arr[i];
                }
                i++;j++;
                if(cs > ans) ans = cs;
            }else{
                cs = cs - arr[i-1] + arr[j];
                if(cs > ans) ans = cs;
                i++;
                j++; 
            }
        }
        return ans;
    }
}

// arr = [2,4,-3,4,3,-4,5,6,-6,7,-8,6,5,4]

// k= 4  


 