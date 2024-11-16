import java.util.HashMap;

public class SubString {
    public static void main(String[] args) {
        String str = "abaxbxyzcxycz";
        int i = 0, j = 0;
        HashMap<Character,Integer> myMap = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        while (j < str.length()) {
            char ch = str.charAt(j);
            if(!myMap.containsKey(ch)){
                myMap.put(ch, j);
            }else{
                int currLength = (j-i);
                if (currLength > ans) {
                    ans = currLength;
                }
                int prevIndex = myMap.get(ch);
                i = prevIndex+1;
                myMap.put(ch,j);
            }
            j+=1;
        }
        System.out.println(ans);
    }
}
