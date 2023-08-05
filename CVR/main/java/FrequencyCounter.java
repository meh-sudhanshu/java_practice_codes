import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,32,3,4,3,44,5,6,4,5,6,7,5,4,3,2,24};

        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            if(map.getOrDefault(value,-1)  == -1){
                map.put(value,1);
            }else{
                map.put(value,map.get(value)+1);
            }
        }

        for(int key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        
    }
}
