import java.util.HashMap;

public class TwoUniqueUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,3,8,1,6,3,8};
        HashMap<Integer,Integer> counterMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(counterMap.containsKey(arr[i])){
                int value = counterMap.get(arr[i]);
                value+=1;
                counterMap.put(arr[i],value);
            }else{
                counterMap.put(arr[i], 1);
            }
        }
        for(int key : counterMap.keySet()){
            if(counterMap.get(key) == 1){
                System.out.println(key);
            }
        }






    }
}
