public class Subarray {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        printAllSubarray(arr);
    }
    private static void printAllSubarray(int[] arr){
        for(int i = 1; i<= arr.length; i++){
            int j = 0, k = i-1;
            while (k < arr.length) {
                for(int l = j; l<=k; l++){
                    System.out.print(arr[l]+" ");
                }
                System.out.println();
                j+=1;
                k+=1;
            }
        }
    }
}
