
import java.util.HashMap;


public class TwoUniqueUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {3,3,5,5,7,8,8,13};
        HashMap<Integer,Integer> myMap = 
                        new HashMap<>();
        for(int e: arr){
            if(myMap.containsKey(e)){
                int value = myMap.get(e);
                value++;
                myMap.put(e, value);
            }else{
                myMap.put(e,1);
            }
        }
        // System.out.println(myMap);
        for(int key: myMap.keySet()){
            int value = myMap.get(key);
            if(value == 1){
                System.out.println(key);
            }
        }
    }
}
