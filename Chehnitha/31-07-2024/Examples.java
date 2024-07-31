import java.util.Arrays;

public class Examples {

    public static boolean isPairExist(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,4,8,9,10};
        int target = 100;

        boolean ans = isPairExist(arr,target);
        System.out.println(ans);

        // int[] reversdArr = new int[arr.length];
        // int i = 0;

        // for(int j=arr.length-1;j>=0;j--){
        //     reversdArr[i] = arr[j];
        //     i+=1;
        // }

        //System.out.println(Arrays.toString(arr));
        //  arr = {10,9,8,4,7,4,3,2,1}
        // int countOfEven = 0, countOfOdd = 0;

        // for(int e : arr){
        //     if(e %2 == 0){
        //         countOfEven+=1;
        //     }else{
        //         countOfOdd+=1;
        //     }
        // }

        // System.out.println(countOfEven+" "+countOfOdd);
    }
}
