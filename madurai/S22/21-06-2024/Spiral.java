class Spiral{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int turn = 1;
        int n = arr.length;
        int totalCount = n*n;
        int count = 0;
        int d1ri = 0,d1csi = 0, d1cei = n-1;
        int d2ci = n-1, d2rsi = 1, d2rei = n-1;
        int d3ri = n-1, d3csi = n-2, d3cei = 0;
        int d4ci = 0, d4rsi = n-2, d4rei = 1;
        while(count < totalCount){
            if(turn == 1){
                for(int i=d1csi;i<=d1cei;i++){
                    System.out.print(arr[d1ri][i]+" ");
                    count+=1;
                }
                d1ri+=1;
                d1csi+=1;
                d1cei-=1;
                turn = 2;
            }else if(turn ==2){
                for(int i=d2rsi;i<=d2rei;i++){
                    System.out.print(arr[i][d2ci]+" ");
                    count+=1;
                }
                d2ci-=1;
                d2rsi+=1;
                d2rei-=1;
                turn = 3;
            }else if(turn ==3 ){
                for(int i=d3csi;i>=d3cei;i--){
                    System.out.print(arr[d3ri][i]+" ");
                    count+=1;
                }
                d3ri-=1;
                d3csi-=1;
                d3cei+=1;
                turn = 4;
            }else{
                for(int i=d4rsi;i>=d4rei;i--){
                    System.out.print(arr[i][d4ci]+" ");
                    count+=1;
                }
                d4ci+=1;
                d4rsi-=1;
                d4rei+=1;
                turn = 1;
            }
        }
    }
}