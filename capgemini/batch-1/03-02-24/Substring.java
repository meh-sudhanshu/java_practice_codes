public class Substring {
    public static void main(String[] args) {
        String str = "cmadamadz";
        int n = str.length();
        int[][] dp = new int[n][n];
        int count = 0;
        int i=0,j=0;
        int jflag = 0;
        while (jflag < n) {
            i=0;
            j = jflag;
            while (j<n) {
                if (i == j) {
                    dp[i][j] = 1;
                    count++;
                }else if(Math.abs(i-j) == 1 || Math.abs(i-j) ==2 ){
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j]=1;
                        count+=1;
                    }
                }else{
                    if (str.charAt(i) == str.charAt(j)) {
                        if(dp[i+1][j-1] == 1){
                            dp[i][j] =1;
                            count+=1;
                        }
                    }
                }
                i+=1;
                j+=1;
            }
            jflag+=1;
        }
        for(int[] arr: dp){
            for(int e : arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
