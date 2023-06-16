
public class Pattern2 {
    public static void main(String[] args) {
        int n =7;
        int a = n-1, b = n-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j>=a && j<=b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            a--; b++;
            System.out.println();
        }
    }
}
