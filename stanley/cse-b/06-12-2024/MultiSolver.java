import java.util.Arrays;

class MultiSolver{
    public static void main(String[] args) {
        int[][] arr = {
            {1,8,2,6,7},
            {3,7,9,22,55},
            {7,33,78,65,3},
            {3,5,2,6,7},
            {98,5,6,2,3}
        };
        int n = arr.length;
        int j = 0;
        while (j < n) {
            int row = 0, col = j;
            while (col < n) {
                System.out.print(arr[row][col]+" ");
                row+=1; col+=1;
            }
            j+=1;
        }
    }
}