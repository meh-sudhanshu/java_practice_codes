public class Pattern1 {
    public static void main(String[] args) {
        int row = 10;
        int col = 2*row - 1;
        int a = row-1, b = row-1;
        for(int i=0;i<row;i++){
            boolean flag = true;
            for(int j=0;j<col;j++){
                if(j>=a && j<=b){
                    if(flag){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    flag = !flag;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            a--;b++;
        }
    }
}
