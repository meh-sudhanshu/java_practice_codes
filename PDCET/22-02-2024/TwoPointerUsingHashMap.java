import java.util.HashMap;

public class TwoPointerUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {3,-1,2,7,9,-5,4,12};
        int target = 18;
        System.out.println(isPairExist(arr,target));
    }

    private static boolean isPairExist(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : arr){
            // if(map.containsKey(e)){
            //     int value = map.get(e);
            //     value+=1;
            //     map.put(e,value);
            // }else{
            //     map.put(e,1);
            // }
            map.put(e,map.getOrDefault(e, 0)+1);
        }

        for(int e : arr){
            int remTarget = target-e;
            if(map.containsKey(remTarget)){
                if(remTarget == e && map.get(remTarget)>1){
                    return true;
                }
                if(remTarget != e) return true;
            }
        }
        return false;
    }
}
