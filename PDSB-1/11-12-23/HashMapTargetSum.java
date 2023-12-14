import java.util.HashMap;

public class HashMapTargetSum {
    public static void main(String[] args) {
        int[] arr = {-2,3,4,5,-8,-90,34,56,76,87};
        int target = 900;
        System.out.println(isPairExist(arr,target));
    }

    private static boolean isPairExist(int[] arr, int target) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int e : arr){
            int value = myMap.getOrDefault(e, 0);
            value+=1;
            myMap.put(e, value);
        }
        for(int e : arr){
            int requiredValue = target-e;
            if (e != requiredValue) {
                if (myMap.containsKey(requiredValue)) {
                    return true;
                }
            }
            if (myMap.getOrDefault(requiredValue, 0) > 1) {
                return true;
            }
        }
        return false;
    }
}
