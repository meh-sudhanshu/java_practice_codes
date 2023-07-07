class LPSubstring{
    public static void main(String[] args) {
        String str = "aabba";
        int n = str.length();
        int[][] dp = new int[n][n];
        
        int i=0,j=0;

        while(j<n){
            int ci=i,cj=j;
            while(ci < n && cj<n){
                if(ci==cj){
                    dp[ci][cj]=1;
                    ci++;
                    cj++;
                }else{
                    if(Math.abs(cj-ci) ==1){
                        if(str.charAt(ci)==str.charAt(cj)){
                                dp[ci][cj]=1;
                        }else{
                            dp[ci][cj]=0;
                        }
                    }else{
                        if(str.charAt(ci)==str.charAt(cj) && dp[ci+1][cj-1]==1){
                            dp[ci][cj]=1;
                        }else{
                            dp[ci][cj]=0;
                        }
                    }
                }
                ci++;
                cj++;
            }
                j++;
                i=0;
        }


        for(int[] arr : dp){
            for(int e : arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}