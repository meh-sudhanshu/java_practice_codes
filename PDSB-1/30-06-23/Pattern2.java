public class Pattern2 {
    public static void main(String[] args) {
        int row = 5;
        int col = 2*row-1;
        int a = row-1, b= row-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j>=a && j<=b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            a--;
            b++;
        }
    }
}
