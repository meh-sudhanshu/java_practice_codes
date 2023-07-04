public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,3,8,7,9,11};
        int i =0, j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++; j--;
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
