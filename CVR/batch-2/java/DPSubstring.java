class DPSubstring{
    public static void main(String[] args) {
        String str = "zaabbax";
        int n = str.length();
        int[][] dp = new int[n][n]; 
        int i=0,j=0;
        int tempi = i;
        int tempj = j;
        while(j < n){
            while(
                 < n){
                if(tempi == tempj){
                    dp[tempi][tempj] = 1;
                }else if(Math.abs(tempj-tempi) == 1){
                    if(str.charAt(tempi) == str.charAt(tempj)){
                        dp[tempi][tempj] =1;
                    }else{
                        dp[tempi][tempj]=0;
                    }
                }else{
                    if(str.charAt(tempi) != str.charAt(tempj)){
                        dp[tempi][tempj]=0;
                    }else{
                        if(dp[tempi+1][tempj-1] == 1){
                            dp[tempi][tempj] =1;
                        }else{
                            dp[tempi][tempj] =0;
                        }
                    }
               
                }
             tempi++;tempj++;
            }
                tempi = 0;
                j++;
                tempj = j;
        }


        for(int[] arr : dp){
            for(int e: arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}