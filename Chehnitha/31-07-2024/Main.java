class Main{
    public static void main(String[] args) {
        int n = 8;
        int num = 1;
        int space = 0;

        for(int i=1;i<=n;i++){
            if(i == 1){
                System.out.print(num);
                space+=1;
                num+=1;
            }else{
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                System.out.print(num+++" ");
                System.out.print(num+++" ");
                space+=1;
            }
            System.out.println();
        }
    }
}