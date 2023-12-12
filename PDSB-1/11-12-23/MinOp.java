class MinOp{
    public static void main(String[] args) {
        int[] arr = {2,5,8,7,9};
        int wholeXor = 0;
        int ans = Integer.MAX_VALUE;
        boolean isAnsPossible = false;
        for(int e : arr) wholeXor = wholeXor ^ e;
        for(int e : arr){
            int exceptThisElementXor  = wholeXor ^ e;
            if(exceptThisElementXor <= e){
                isAnsPossible = true;
                int currAns = e - exceptThisElementXor;
                if (currAns < ans) {
                    ans = currAns;
                }
            }
        }
        if (isAnsPossible == false) {
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }

    }
}