
public class DiagonalTrace {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 0, 5, 6, 7 }, { 0, 0, 8, 9 }, { 0, 0, 0, 10 } };
        printDiagonally(arr);
    }

    private static void printDiagonally(int[][] arr) {
        int n = arr.length;
        int si = 0, ei = 0;
        while (ei < n) {
            si = 0;
            int ci = ei;
            while (ci < n) {
                System.out.print(arr[si][ci]+" ");
                si+=1;
                ci+=1;
            }
            //
            ei += 1;
        }
    }
}
