class Spiral{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},
                        {9,10,11,12},{13,14,15,16}};

        int n = arr.length;
        int direction = 1, count = 0, total = arr.length*arr[0].length;
        int d1rn = 0, d1csi = 0, d1cei = n-1;
        int d2cn = n-1, d2rsi = 1, d2rei = n-1;
        int d3rn = n-1, d3csi = n-2, d3cei = 0;
        int d4cn = 0, d4rsi = n-2, d4rei = 1;

        while (count < total) {
            if(direction == 1){
                for(int i = d1csi; i<=d1cei;i++){
                    System.out.print(arr[d1rn][i]+" ");
                    count++;
                }
                d1rn++;
                d1csi++;
                d1cei--;
                direction = 2;
            }else if(direction == 2){
                for(int i = d2rsi;i<=d2rei;i++){
                    System.out.print(arr[i][d2cn]+" ");
                    count++;
                }
                d2cn--;
                d2rsi++;
                d2rei--;
                direction = 3;
            }else if(direction == 3){
                for(int i = d3csi;i>=d3cei;i--){
                    System.out.print(arr[d3rn][i]+" ");
                    count++;
                }
                d3rn--;
                d3csi--;
                d3cei++;
                direction = 4;
            }else{
                for(int i = d4rsi; i>=d4rei;i--){
                    System.out.print(arr[i][d4cn]+" ");
                    count++;
                }
                d4cn++;
                d4rsi++;
                d4rei--;
                direction = 1;
            }
        }
    }
}