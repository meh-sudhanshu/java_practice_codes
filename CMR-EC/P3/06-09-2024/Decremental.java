public class Decremental {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8};
        int ans = Integer.MAX_VALUE;
        boolean isAnsPossible = false;
        int wholeXor = 0;
        for(int e : arr)
            wholeXor = wholeXor ^ e;
        for(int e : arr){
            int except = wholeXor ^ e;
            if(except <= e){
                isAnsPossible = true;
                int currentAns = e - except;
                if (currentAns < ans) {
                    
                    ans = currentAns;
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
