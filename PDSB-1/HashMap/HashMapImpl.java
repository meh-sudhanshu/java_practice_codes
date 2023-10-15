package HashMap;

import java.util.HashMap;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(0,"Zero");
        myMap.put(1,"One");
        myMap.put(2,"Two");
        myMap.put(1000,"Thousand");
        printMap(myMap);
//        String value = myMap.getOrDefault(100,"default value");
//        System.out.println(value);

        myMap.put(2,"Updated value for key 2");
        printMap(myMap);
        System.out.println(myMap.keySet()+" all the key set    ");
    }
    public static  void printMap(HashMap<Integer,String> myMap){
        for(int key : myMap.keySet()){
            String value = myMap.get(key);
            System.out.print(key+"--->"+value+"    ");
        }
        System.out.println();
    }
}
