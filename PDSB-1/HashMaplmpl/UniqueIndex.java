import java.util.HashMap;

public class UniqueIndex {
    public static void main(String[] args) {
        String str = "FFBBFFBBB";
        HashMap<Integer,Integer> myMap = new HashMap<>();
        myMap.put(0, 1);
        int ci = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'F') {
                ci+=2;
            }else{
                ci -= 1;
            }

            if (ci >=0) {
                myMap.put(ci, myMap.getOrDefault(ci, 0)+1);
            }
        }
        int count = 0;
        for(int key : myMap.keySet()){
            int value = myMap.get(key);
            if (value == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
