import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = 
            {3,2,5,2,7,23,4,3,4,2,3,2,2,2,2,3,4,3,2};
        int majorityCount = 0;
        int majorityElement = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int e = arr[i];
            if(!map.containsKey(e)){
                map.put(e,1);
            }else{
                int value = map.get(e);
                map.put(e,value+1);
            }
        }
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value > majorityCount){
                majorityCount = value;
                majorityElement = key;
            }
        }

        System.out.println(majorityElement);
    }
}
