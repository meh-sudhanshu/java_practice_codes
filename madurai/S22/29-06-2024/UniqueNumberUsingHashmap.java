import java.util.HashMap;

public class UniqueNumberUsingHashmap {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 4, 4, 2, 7, 9, 3 };
        int ans = getUniqueNumber(arr);
        System.out.println(ans);
    }

    private static int getUniqueNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            if (map.containsKey(e)) {
                int value = map.get(e);
                value += 1;
                map.put(e, value);
            } else {
                map.put(e, 1);
            }
        }
        int ans = -1;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans = key;
                break;
            }
        }
        return ans;
    }
}
