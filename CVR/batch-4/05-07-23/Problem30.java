import java.util.HashMap;

public class Problem30 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1,4,3,4,5,6,7,4,3,2};
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int e : arr){
            int value = myMap.getOrDefault(e,0);
            myMap.put(e, value+1);
        }
        //System.out.print(myMap);
        for(int key:myMap.keySet()){
            int value = myMap.get(key);
            if(value >1){
                System.out.println(key);
            }
        }

    }
}
