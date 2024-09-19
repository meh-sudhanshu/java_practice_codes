import java.util.Arrays;

class TargetSum{
    public static void main(String[] args){
        int[] arr = {-10,3,5,2,90,67,98,96,69};
        int target = 100;
        Arrays.sort(arr);
        boolean ans = isPairExist(arr,target);
        System.out.println(ans);
    }

    private static boolean isPairExist(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            if(sum < target) i+=1;
            if(sum > target) j-=1;
        }
        return false;
    }
}