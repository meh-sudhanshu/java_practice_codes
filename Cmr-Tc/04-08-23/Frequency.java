import java.util.HashMap;

class Frequency{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {-2,4,6,4,87,56,45,87,45,35};  
        for(int e: arr){
            if(map.containsKey(e)){
                int value = map.get(e);
                map.put(e,value+1);
            }else{
                map.put(e,1);
            }
        }
        System.out.println(map);
    }
}