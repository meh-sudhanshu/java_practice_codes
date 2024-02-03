import  java.util.*;
class TwoPointer{
    public static void main(String[] args){
        int[] arr = {2,5,2,7,-5,9,3,12,54};
        int target = 400;
        //System.out.println(isPairExist(arr,target));
        System.out.println(isTripletExist(arr, target));
    }

    public static boolean isPairExist(int[] arr,int target){
        Arrays.sort(arr);
        int i=0, j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j] < target) i++;
            if(arr[j]+arr[i] > target) j--;
            if(arr[i]+arr[j] == target) return true;
        }
        return false;
    }

    public static boolean isTripletExist(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int selectedElement = arr[i];
            int newTarget = target-selectedElement;
            
            int[] newArray = new int[arr.length];
            for(int j=0;j<arr.length;j++){
                if(j!=i && arr[j]!=0){
                    newArray[j] = arr[j];
                }
            }
            if(isPairExist(newArray, newTarget)){
                return true;
            }


        }
        return false;
    }
}