import java.util.*;
class MaximumSumWithDistinctElement{
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,7,-4,3,2,9,7,1,0,-11,9,9,9};
        int ws = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = getMaximumSubarraySumWithDistinctElement(arr,map,ws);
        System.out.println(ans);
    }

    public static int getMaximumSubarraySumWithDistinctElement(int[] arr,  HashMap<Integer,Integer> map, int ws){
            int i = 0, j = ws-1;
            int ans = Integer.MIN_VALUE;
            int previousSum = 0;
            while(j < arr.length){
                System.out.println(map);
                int currentSum = 0;
                if(i == 0){
                    for(int k=i;k<=j;k++){
                        currentSum+=arr[k];
                        if(map.containsKey(arr[k])){
                            int value = map.get(arr[k]);
                            value+=1;
                            map.put(arr[k],value);
                        }else{
                            map.put(arr[k],1);
                        }
                    }
                    previousSum = currentSum;
                }else{
                    currentSum = previousSum - arr[i-1] + arr[j];
                    previousSum = currentSum;
                    if(map.containsKey(arr[i-1])){
                        int value = map.get(arr[i-1]);
                        if(value == 1){
                            map.remove(arr[i-1]);
                        }else{
                            int counterValue = map.get(arr[i-1]);
                            counterValue-=1;
                            map.put(arr[i-1],counterValue);
                        }
                        if(map.containsKey(arr[j])){
                            int jValue = map.get(arr[j]);
                            jValue+=1;
                            map.put(arr[j],jValue);
                        }else{
                            map.put(arr[j],1);
                        }
                    }
                    
                }
                i+=1;
                j+=1;
                
                if(map.size() == ws){
                    //System.out.println(currentSum+" current sum");
                    ans = Math.max(ans,currentSum);
                }
            }

            return ans;

    }

}