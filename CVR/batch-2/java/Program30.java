import java.util.HashMap;
class Program30{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,4,5,6,4,5,7,8,9};
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int e : arr){
            int value = myMap.getOrDefault(e,0);
            myMap.put(e, value+1);
        }
        for(int key : myMap.keySet()){
            if(myMap.get(key) >1){
                System.out.print(key+" ");
            }
        }
    }
}