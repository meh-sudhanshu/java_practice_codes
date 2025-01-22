import java.util.HashMap;
import java.util.Set;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        // put is an insert if key is not present else it is an
        // update operation
        myMap.put(1,10);
        myMap.put(1,20);
        
        if(myMap.containsKey(1)){
            int value = myMap.get(1);
            System.out.println(value);
        }
        int value = myMap.getOrDefault(10, null);
        Set<Integer> allKeys =  myMap.keySet();
        System.out.println(allKeys);
    }
}
