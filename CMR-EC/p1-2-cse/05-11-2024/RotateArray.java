import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int[] arr = {8,-3,4,1,57,89,1,5,2,4,5,7};
        int index = 4;
        int n = arr.length;
        int[] rightArray = new int[n-index];
        int[] leftArray = new int[index];
        int rai = 0;
        for(int i = n-1; i>=index;i--){
            rightArray[rai] = arr[i];
            rai++;
        }
        System.out.println(Arrays.toString(rightArray));
        for(int i = 0; i< index; i++){
            leftArray[i] = arr[i];
        }
        System.out.println(Arrays.toString(leftArray));
        rai = 0;
        int lai = 0;
        for(int i = 0; i < arr.length;i++){
            if(rai < rightArray.length){
                arr[i] = rightArray[rai];
                rai+=1;
            }else{
                arr[i] = leftArray[lai];
                lai+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}