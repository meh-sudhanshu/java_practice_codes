class AlternatePyramid{
    public static void main(String[] args) {
        int row = 5;
        int col = 2*row -1;

        int a = row-1, b = row-1;

        for(int i=0;i<row;i++){
            boolean flag = true;
            for(int j=0;j<col;j++){
                if(j>=a && j<=b){
                    if(flag == true){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    flag = !flag;
                }else{
                    System.err.print(" ");
                }
            }
            System.out.println();
            a--;
            b++;
        }

    }
}