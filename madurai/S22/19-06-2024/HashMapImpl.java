import java.util.*;
class HashMapImpl{
    public static void main(String[] args){
       HashMap<String,String> map = new HashMap<>();
       
       map.put("name","sudhanshu kumar");
       System.out.println(map);
       map.put("name","sudhanshu kumar singh");
       System.out.println(map);

       String name = map.get("name");
       System.out.println(name);

       String state = map.get("state");
       System.out.println(state);
       map.put("state","BIHAR");

       if(map.containsKey("state")){
            state = map.get("state");
            System.out.println(state);
       }else{
            System.out.println("INVALID_KEY");
       }

       String age = map.getOrDefault("age","18+");
       System.out.println(age);

       map.put("age","26");
       age = map.getOrDefault("age","18+");
       System.out.println(age);


        Set<String> allKeys = map.keySet();
        System.out.println(allKeys);
       
        for(String key : allKeys){
            System.out.println(map.get(key));
        }

        System.out.println(map.size());

       //Test t = new Test(2,3);
    }

    // static class Test{
    //     Test(int a, int b){
    //         System.out.println(a+b);
    //     }
    // }
}