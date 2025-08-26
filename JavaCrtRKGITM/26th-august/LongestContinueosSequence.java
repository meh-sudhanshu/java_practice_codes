
import java.util.*;
class LongestContinueosSequence{
    public static void main(String[] args){
        int[] arr = {3,4,2,1,6,9,12,7,8,11,15,18,16,20};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : arr){
            map.put(e,1);
        }
        int ans = Integer.MIN_VALUE;
        for(int e : arr){
            if(!map.containsKey(e-1)){
                int n = e;
                int count = 0;
                while(map.containsKey(n)){
                    count+=1;
                    n+=1;
                }
                if(count > ans) ans = count;
            }
        }
        System.out.print(ans);
    }
}