public class MinOp {
    public static void main(String[] args) {
        int[] arr = {3,8,17,15,13,19,4,5};
        boolean isAnsPossible = false;
        int ans = Integer.MAX_VALUE;
        int wholeXor = 0;
        int element = -1;
        for(int i = 0; i <arr.length; i++){
            wholeXor = wholeXor ^ arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            int e = arr[i];
            int exceptXor = wholeXor ^ e;
            if(exceptXor <= e){
                isAnsPossible = true;
                int currAns = e - exceptXor;
                if(currAns < ans){
                    ans = currAns;
                    element = e;
                }
            }
        }
        if (isAnsPossible) {
            System.out.println(ans);
            System.out.println(element);
        }else{
            System.out.println(-1);
        }
    }
}
