public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        int turn = 1;
        int d1r = 0, d1cs = 0 , d1ce = col-1;
        int d2c = col-1, d2rs = 1, d2re = row-1;
        
        while (count < row*col) {
            if(turn == 1){
                // do something
                turn = 2;
            }else if(turn == 2){
                // do

                turn = 3;
            }else if(turn == 3){
                //
                 turn = 4;
            }else{
                // 
                turn = 1;
            }
        }
    }
}
