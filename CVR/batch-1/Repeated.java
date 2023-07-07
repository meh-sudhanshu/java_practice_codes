import java.util.HashMap;

public class Repeated {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,5,6,4,4,5,5,67,-2,8,3};
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int e : arr){
            int value = myMap.getOrDefault(e,0);
            myMap.put(e,value+1);
        }
        for(int key : myMap.keySet()){
            if(myMap.get(key) > 1){
                int value = myMap.get(key);
                while(value != 0){
                    System.out.print(key+" ");
                    value--;
                }
            }
        }
    }    
}
