public class Pattern {
    public static void main(String[] args) {
        int row = 8;
        for(int i=1;i<=row;i++){
            int count = 0;
            char ch = 'a';

            while(count != i){
                System.out.print(ch++);
                count++;
            }
            System.out.println();
        }
    }
}
