public class MultiSolver {
    public static void main(String[] args) {
        int[][] arr = {{3,-1,2,9},{0,8,7,6},{5,-2,3,-2},{8,-1,9,6}};
        int n = 4;
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