public class Decrementele {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9};
        int wholeXor = 0;
        boolean isAnsPossible = false;
        for(int e : arr)
            wholeXor = wholeXor ^ e;
        int ans = Integer.MAX_VALUE;
        for(int currentElement : arr){
            int xorExceptCurrentEle = wholeXor ^ currentElement;
            if (xorExceptCurrentEle <= currentElement) {
                isAnsPossible = true;
                int currentAns = currentElement - xorExceptCurrentEle;
                if (currentAns < ans) {
                    ans = currentAns;
                }
            }
        }
        if (isAnsPossible) {
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
