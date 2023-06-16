public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for(int[] x : arr){
            for(int val: x){
                System.out.print(val+" ");
            }
            System.out.println();  
        }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         arr[i][j] = i;
        //     }
        // }
        // for(int i=0; i<4;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }

        int[] sdarr = new int[6];
        // for(int i=0;i<sdarr.length;i++){
        //     System.out.println(sdarr[i]);
        // }
        for(int val : sdarr){
            System.out.println(val);
        }
    } 
}
