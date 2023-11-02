import java.util.HashMap;

public class UniquePosition {
    public static void main(String[] args) {
        String str = "FFFBFBFBFBFBFBBFBFB";
        int currIndex = 0;
        System.out.println(usingArray(str,currIndex));
        System.out.println(usingHashMap(str,currIndex));
    }

    private static int usingHashMap(String str, int currIndex) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        myMap.put(0, 1);
        for(int i=0;i<str.length();i++){
             if(str.charAt(i) == 'F'){
                currIndex+=2;
            }else{
                if(currIndex - 1 >=0) currIndex-=1;
            }
            myMap.put(currIndex, 1);
        }
        int ans = 0;
        for(int key : myMap.keySet()) ans+=1;
        return ans;
    }

    private static int usingArray(String str, int currIndex) {
        // maximum possible ans is 100
        int[] visited = new int[100];
        visited[0] = 1;
        int ans = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'F'){
                currIndex+=2;
            }else{
                if(currIndex - 1 >=0) currIndex-=1;
            }
            if(visited[currIndex] == 0){
                ans+=1;
                visited[currIndex] = 1;
            }
        }
        return ans;

    }


}
