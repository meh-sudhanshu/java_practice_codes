import java.util.HashMap;

public class UniquePositions {
    public static void main(String[] args) {
        HashMap<Integer,Integer>  myMap = new HashMap<>();
        String str = "FBFBFFBFBFBBBFBFBFBFBBFFFFBBFB";
        myMap.put(0, 0);
        int currentIndex = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'F'){
                currentIndex+=2;
            }else{
                if(currentIndex -1 >=0) currentIndex -= 1;
            }
            myMap.put(currentIndex,0);
        }
        System.out.println(myMap);
    }
}
