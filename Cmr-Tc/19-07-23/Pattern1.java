

public class Pattern1 {
    public static void main(String[] args) {
        int n= 5;
        char ch = 'a';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
