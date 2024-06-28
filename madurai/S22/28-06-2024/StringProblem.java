
public class StringProblem {
    public static void main(String[] args) {
        String str = "madam";
        printAns(str);
    }

    private static void printAns(String str) {
        int n = str.length();
        int[][] arr = new int[n][n];
        int si = 0, ei = 0;
        int totalCount = 0;
        while (ei < n) {
            si = 0;
            int ci = ei;
            while (ci < n) {
                if(si == ci){
                    arr[si][ci] = 1;
                    totalCount+=1;
                }else if(Math.abs(ci-si) <=2){
                    if(str.charAt(si) == str.charAt(ci)){
                        arr[si][ci] = 1;
                        totalCount+=1;
                    }
                }else{
                    if(str.charAt(si) == str.charAt(ci)){
                        if(arr[si+1][ci-1] == 1){
                            arr[si][ci] = 1;
                            totalCount+=1;
                        };;;;;;;;;;;;;;;;;;;;;;;;;;;
                    }
                }
                //System.out.print(arr[si][ci]+" ");
                si+=1;
                ci+=1;
            }
            //
            ei += 1;
        }
        System.out.println(totalCount);
    }
}
