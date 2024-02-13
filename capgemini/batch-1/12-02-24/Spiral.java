
public class Spiral {
        public static void main(String[] args) {
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
            int row = arr.length;
            int col = arr[0].length;
            int count = row*col;
            int i=0,j=0;
            int turn = 1;
            int colStart = 0, colEnd = col-1;
            int rowStart = 1, rowEnd = row-1;
            while (count > 0) {
                if(turn == 1){
                    while (j < colEnd) {
                        System.out.print(arr[i][j]+" ");
                        j+=1;
                        count-=1;
                    }
                    turn = 2;
                    colEnd-=1;
                }else if(turn == 2){
                    while (i<rowEnd) {
                        System.out.print(arr[i][j]+" ");
                        count-=1;
                        i+=1;
                    }
                    rowEnd-=1;
                    turn = 3;
                }else if(turn == 3){
                    while (j> colStart) {
                        System.out.print(arr[i][j]+" ");
                        j-=1;
                        count-=1;
                    }
                    colStart+=1;
                    turn = 4;
                }else{
                    while (i>rowStart) {
                        System.out.print(arr[i][j]+" ");
                        count-=1;
                        i-=1;
                    }
                    turn = 1;
                    rowStart+=1;
                }
            }
        }    
}
