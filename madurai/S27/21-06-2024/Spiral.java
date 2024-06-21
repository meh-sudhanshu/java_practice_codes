


class Spiral{
    public static void main(String[] args){
        int[][] arr = {{8,9,3,4},{1,2,9,5},{6,3,9,8},{5,6,9,7}};
        int n = arr.length;
        int turn = 1;
        int count = 0;
        int totalCount = n*n;
        int fdri = 0, fdcsi = 0, fdcei = n-1;
        int sdci = n-1, sdrsi = 1, sdrei = n-1;
        int tdri = n-1, tdcsi= n-2, tdcei = 0;
        int fdci = 0, fdrsi = n-2, fdrei = 1;
        while(count < totalCount){
            if(turn == 1){
                for(int i = fdcsi; i<=fdcei;i++){
                    System.out.print(arr[fdri][i]+" ");
                    count+=1;
                }
                fdri+=1;
                fdcsi+=1;
                fdcei-=1;
                turn = 2;
            }else if(turn == 2){
                for(int i=sdrsi;i<=sdrei;i++){
                    System.out.print(arr[i][sdci]+" ");
                    count+=1;
                }
                sdci-=1;
                sdrsi+=1;
                sdrei-=1;
                turn = 3;
            }else if(turn == 3){
                for(int i=tdcsi;i>=tdcei;i--){
                    System.out.print(arr[tdri][i]+" ");
                    count+=1;
                }
                tdri-=1;
                tdcsi-=1;
                tdcei+=1;
                turn = 4;
            }else{
                for(int i=fdrsi;i>=fdrei;i--){
                    System.out.print(arr[i][fdci]+" ");
                    count+=1;
                }
                fdci+=1;
                fdrsi-=1;
                fdrei+=1;
                turn = 1;
            }
        }
    }
}