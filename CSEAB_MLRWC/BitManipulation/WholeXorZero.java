public class WholeXorZero {
    public static void main(String[] args) {
        int[] arr = {3,8,3,7,60,8,16,15,19,2,19,8,6,2,8,6};
        int wholeXor = 0;
        for(int e : arr){
            wholeXor = wholeXor ^ e;
        }
        int ans = Integer.MAX_VALUE;
        boolean isAnsPosiible = false;
        for(int e : arr){
            int wholeXorExceptE = wholeXor ^ e;
            if(wholeXorExceptE < e){
                int currAns = e - wholeXorExceptE;
                isAnsPosiible = true;
                if(currAns < ans) ans = currAns;
            }
        }
        if(isAnsPosiible){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
