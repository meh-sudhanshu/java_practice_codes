public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {1,7,12,16,19,21},{0,2,8,13,17,20},
            {0,0,3,9,14,18},{0,0,0,4,10,15},
            {0,0,0,0,5,11},{0,0,0,0,0,6}
        };
        printDiagonallyFromMiddleDiagonal(arr);
    }

    private static void printDiagonallyFromMiddleDiagonal(int[][] arr) {
        int ri=0,ci=0;
        while(ci < arr.length){
            int cFlag = ci;
            while (cFlag < arr.length){
                System.out.print(arr[ri][cFlag]+" ");
                ri+=1;
                cFlag+=1;
            }
            ri = 0;
            ci+=1;
        }

    }
}
