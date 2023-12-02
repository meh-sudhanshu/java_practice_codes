class MinStep{
    public static void main(String[] args) {
        int[] arr = {5,7,8};
        int wholeXor = 0;
        int isAnsPossible = -1;
        int ans = Integer.MAX_VALUE;
        for(int e : arr) wholeXor = wholeXor ^ e;
        for(int e : arr){
            int exceptThisElementXor = wholeXor ^ e;
            if(exceptThisElementXor < e){
                isAnsPossible = 1;
                int currAns = e - exceptThisElementXor;
                if (currAns < ans) {
                    ans = currAns;
                }
            }
        } 
        if (isAnsPossible == -1) {
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }

    }
}