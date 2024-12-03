import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String str = "axaxacxfaxaxaxatrcxaxatsx";
        HashMap<Character,Integer> myMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(myMap.containsKey(ch) == false){
                myMap.put(ch,1);
            }else{
                int oldValue= myMap.get(ch);
                int newValue = oldValue + 1;
                myMap.put(ch,newValue);
            }
        } 
        System.out.println(myMap);
    }
}
