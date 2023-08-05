import java.util.HashMap;

public class UniqueCount {
    public static void main(String[] args) {
        String str  = "FBBFBBF";
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int uniqueCount = 1;
        int currentIndex = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'F'){
                currentIndex+=2;
                if(!map.containsKey(currentIndex)){
                    uniqueCount++;
                    map.put(currentIndex,1);
                }
            }else{
                currentIndex-=1;
                 if(!map.containsKey(currentIndex)){
                    uniqueCount++;
                    map.put(currentIndex,1);
                }

            }
        }
        System.out.println(uniqueCount);
    }
}
