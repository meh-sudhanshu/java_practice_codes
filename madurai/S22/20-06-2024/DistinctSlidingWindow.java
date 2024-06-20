import java.util.*;
class DistinctSlidingWindow{
    public static void main(String[] args){
        int[] arr = {-2,3,4,2,-5,-6,7,-5,-7,8,-56};
        int ws = 4;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = getMaximumDistinctSum(arr,map,ws);
        System.out.println(ans);
    }
    public static int getMaximumDistinctSum(int[] arr,HashMap<Integer,Integer> map, int ws ){
        int i=0, j = ws-1;
        int ans = Integer.MIN_VALUE;
        int previousSum = 0;
        boolean isAnsPossible = false;
        while(j < arr.length){
            int currentSum = 0;
            if(i == 0){
                for(int k=i;k<=j;k++){
                     currentSum+=arr[k];
                     int value = map.getOrDefault(arr[k],0);
                     value+=1;
                     map.put(arr[k],value);
                }
                previousSum = currentSum;
            }else{
                currentSum = previousSum - arr[i-1] + arr[j];
                previousSum = currentSum;
                int currentCounter = map.get(arr[i]);
                if(currentCounter == 1){
                    map.remove(arr[i]);
                }else{
                    currentCounter-=1;
                    map.put(arr[i],currentCounter);
                }

                int jCounter = map.getOrDefault(arr[j],0);
                jCounter+=1;
                map.put(arr[j],jCounter);
            }
            i+=1;
            j+=1;
            if(map.size() == ws){
                isAnsPossible = true;
                ans = Math.max(ans,currentSum);
            }
        }
        if(isAnsPossible == false ) return -1;
        return ans;
    }
}