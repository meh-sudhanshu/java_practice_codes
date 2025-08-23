
import java.util.*;

class HashMapImpl{
    public static void main(String[] args){
        HashMap<String,String> myMap = new HashMap<>();
        myMap.put("sanjana","please do not write while i teach");
        System.out.println(myMap);
        myMap.put("sanjana","I will give your notebook back");
        myMap.put("message","do not come late");
        System.out.println(myMap);

        if(myMap.containsKey("sanjana")){
            String myValue = myMap.get("test");
            System.out.println(myValue);
        }else{
            System.out.println("Key is Missing !!");
        }

        String value = myMap.getOrDefault("message","Key  test is Missing !!");
        System.out.println(value);

      
        for(String key : myMap.keySet()){
            System.out.println(myMap.get(key));
        }


    }
}

/* Wrapper classes : int-> Integer, byte-> Byte, short-> Short
    long -> Long
    char-> Character
    bool -> Boolean
    float-> Float
    double-> Double
*/