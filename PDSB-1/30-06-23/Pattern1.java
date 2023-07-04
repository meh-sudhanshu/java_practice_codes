public class Pattern1 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
