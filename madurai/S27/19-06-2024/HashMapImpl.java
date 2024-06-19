import java.util.*;
class HashMapImpl{
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("name","sudhanshu");
        System.out.println(map);
        map.put("name","sudhanshu kumar singh");
        System.out.println(map);

        String name = map.get("name");
        System.out.println(name);

        map.put("age","26");

        if(map.containsKey("age")){
            String age = map.get("age");
            System.out.println(age);
        }else{
            System.out.println("key age is not present");
        }
        map.put("state","Bihar Is lob");
        String state = map.getOrDefault("state","Bihar");
        System.out.println(state);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String key : keys){
            System.out.println(map.get(key));
        }
        System.out.println(map.size());


        // Test t = new Test();
    }
    // static class Test{
    //     Test(int a, int b){
    //         System.out.println(a+b);
    //     }
    // }
}