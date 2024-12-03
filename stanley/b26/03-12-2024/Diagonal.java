public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {8,4,1,4,6},
            {4,4,2,5,6},
            {7,5,8,4,9},
            {5,3,8,2,6},
            {-2,3,6,1,7}
        };
        int n = arr.length;
        int j = 0;
        while (j < n) {
            int i = 0;
            int jFlag = j;
            while (jFlag < n) {
                System.out.print(arr[i][jFlag]+" ");
                i+=1;
                jFlag+=1;
            }

            j+=1;
        }
    }
}
