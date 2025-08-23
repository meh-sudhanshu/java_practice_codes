

class MinDecrement{
    public static void main(String[] args){
        int[] arr = {17,2,9,3,18,7,25,9};
        int ans = Integer.MAX_VALUE;
        boolean isAnsPossible = false;
        int wholeXor = 0;
        for(int i = 0; i < arr.length; i++) wholeXor^=arr[i];
        for(int i = 0; i< arr.length; i++){
            int ele = arr[i];
            int xorExceptEle = wholeXor ^ ele;
            if(xorExceptEle <= ele){
                isAnsPossible = true;
                int cAns = ele- xorExceptEle;
                if(cAns < ans) ans = cAns;
            }
        }
        if(isAnsPossible == false){
            System.out.print(-1);
        }else{
            System.out.print(ans); 
        }
    }
}