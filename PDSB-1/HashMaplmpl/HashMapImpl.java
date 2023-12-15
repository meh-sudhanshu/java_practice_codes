import java.util.HashMap;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String,String> myMap = new HashMap<>();

        myMap.put("name", "sudhanshu kumar");
        myMap.put("age","24");
        myMap.put("height","5ft 8inch");
        myMap.put("dummy key","dummy value");
       
        for(String key : myMap.keySet()){
            System.out.println(key+"---->"+myMap.get(key));
        }

        // if a key is not present .get() method will return null
        System.out.println(myMap.get("keyyyyyyyy"));
        String getOrDefaultOnAKey = myMap.getOrDefault("name2323","0");
        System.out.println(getOrDefaultOnAKey);


         // myMap.put("name","sudhanshu")
        /*
         int[] arr = new int[5];
         arr[0]=1;
         for(int e : arr){

         }
         */

    }
}
