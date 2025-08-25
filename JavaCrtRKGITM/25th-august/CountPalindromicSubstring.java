


class CountPalindromicSubstring{
    public static void main(String[] args){
        String str = "tamadamxxmay";
        String largest = "";
        String smallest = "";
        int n = str.length();
        int[][] dp = new int[n][n];
        int count = 0;
        for(int i = 0; i< n; i++){
            int col = i;
            int row = 0;
            while(col < n){
                if(row == col){
                    dp[row][col] = 1;
                    count+=1;
                    largest = str.substring(row,col+1);
                }else if(col - row <= 2){
                    if(str.charAt(row) == str.charAt(col)){
                        dp[row][col] = 1;
                        count+=1;
                        largest = str.substring(row,col+1);
                        if(smallest.equals("")){
                            smallest = str.substring(row,col+1);
                        }
                    }
                }else{
                    if(str.charAt(row) == str.charAt(col)){
                        if(dp[row+1][col-1] == 1){
                            dp[row][col] = 1;
                            count+=1;
                            largest = str.substring(row,col+1);
                              if(smallest.equals("")){
                                smallest = str.substring(row,col+1);
                            }
                        }
                    }
                }
                row+=1;
                col+=1;
            }
        }
        System.out.println(count);
        System.out.println(largest);
        System.out.println(smallest);
    }
}