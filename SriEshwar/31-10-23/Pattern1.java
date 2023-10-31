
public class Pattern1 {
    public static void main(String[] args) {
        int row = 6;
        int col = row;

        int start = row-1, end = row-1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+j == row-1 || i==j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
