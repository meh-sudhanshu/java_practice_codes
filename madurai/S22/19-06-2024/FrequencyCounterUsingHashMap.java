import java.util.HashMap;
class FrequencyCounterUsingHashMap{
    public static void main(String[] args){
        String str = "axaxfxsfxasaxafcsw";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                value+=1;
                // value++
                // value+=1
                map.put(ch,value);
            }else{
                map.put(ch,1);
            }
        }

        System.out.print(map);

    }
}