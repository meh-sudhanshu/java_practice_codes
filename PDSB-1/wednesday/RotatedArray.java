package wednesday;

public class RotatedArray {
    public static void main(String[] args) {
        int[] rotatedArray = {565,230,128,-3,7,8,10,20};
        int ans = getRoatetdIndex(rotatedArray);
        System.out.println(ans);
    }

    private static int getRoatetdIndex(int[] arr) {
        for(int i =0; i<arr.length;i++){
            if(arr[i+1] < arr[i] && arr[i+2]<arr[i+1]){
                continue;
            }else{
                return (arr.length - (i+1));
            }
        }
        return 0;
    }
}
