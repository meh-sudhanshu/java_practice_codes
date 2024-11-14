import java.util.HashMap;

public class SubStrLength {
    public static void main(String[] args) {
        String str = "aaaapoetryabcdssscg";
        int ans = findLengthOfSubstringWithAllDistinctElement(str);
        System.out.println(ans);
    }
    private static int findLengthOfSubstringWithAllDistinctElement(String str){
        HashMap<Character,Integer> myMap = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        int i =0, j = 0;
        while (j < str.length()) {
            char ch = str.charAt(j);
            if (!myMap.containsKey(ch)) {
                myMap.put(ch,j);
            }else{
                int currIndex = myMap.get(ch);
                if (currIndex < i) {
                    myMap.put(ch,j);
                }else{
                    int currLength = (j-i);
                    if (currLength > ans) {
                        ans = currLength;
                    }
                    myMap.put(ch,j);
                    i = currIndex+1;
                }
               
            }
            j+=1;
        }
        return Math.max(j-i,ans);
    }
}
