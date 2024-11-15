public class MultiSolver {
    public static void main(String[] args) {
        String str = "axamadama";
        int n = str.length();
        int[][] dp = new int[n][n];
        mutiSolver(str,dp,n);
    }   
    private static void mutiSolver(String str,int[][] dp,int n){
        int columnIndex = 0;
        String largestPalindromicSubString = "";
        String smallestPalindromicSubstringWhichIsNotOneInLength = "";
        int totalNumberOfPalindromicSubstring = 0;
        while (columnIndex < n) {
            int ri = 0;
            int ci = columnIndex;
            while (ci < n) {
                if(ri == ci){
                    dp[ri][ci] = 1;
                    totalNumberOfPalindromicSubstring +=1;
                    largestPalindromicSubString = str.substring(ri,ci+1);
                }else if(Math.abs(ri-ci) <= 2){
                    if(str.charAt(ri) == str.charAt(ci)){
                        dp[ri][ci] = 1;
                        totalNumberOfPalindromicSubstring+=1;
                        largestPalindromicSubString = str.substring(ri,ci+1);
                        if(smallestPalindromicSubstringWhichIsNotOneInLength.equals("")){
                            smallestPalindromicSubstringWhichIsNotOneInLength = str.substring(ri,ci+1);
                        }
                    }
                }else{
                    if(str.charAt(ri) == str.charAt(ci) &&
                        dp[ri+1][ci-1] == 1
                    ){
                        dp[ri][ci] = 1;
                        totalNumberOfPalindromicSubstring+=1;
                        largestPalindromicSubString = str.substring(ri,ci+1);
                        if(smallestPalindromicSubstringWhichIsNotOneInLength.equals("")){
                            smallestPalindromicSubstringWhichIsNotOneInLength = str.substring(ri,ci+1);
                        }
                    }
                }
                ri+=1;
                ci+=1;
            }
            columnIndex+=1;
        }
        System.out.println(totalNumberOfPalindromicSubstring);
        System.out.println(largestPalindromicSubString);
        System.out.println(smallestPalindromicSubstringWhichIsNotOneInLength);
    }
}