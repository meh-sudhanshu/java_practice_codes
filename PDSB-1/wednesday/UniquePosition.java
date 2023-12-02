package wednesday;

import java.util.HashMap;

public class UniquePosition {
    public static void main(String[] args) {
        String str = "FFBFBFBFFFFBBBBFBFFB";
        int ans = getUniquePositionsCount(str);
        System.out.println(ans);
        int ans1 = getUniquePositionsCountUsingArray(str);
        System.out.println(ans1);
    }

    private static int getUniquePositionsCountUsingArray(String str) {
        int[] arr = new int[100];
        int ci = 0;
        arr[0]=1;
        for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
             if(ch == 'F') ci+=3;
             else ci-=2;
             if(arr[ci]!=1) arr[ci]=1;
        }
        int ans = 0;
        for(int e : arr) ans+=e;
        return ans;
    }

    private static int getUniquePositionsCount(String str) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ci = 0;
        map.put(0, 1);
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'F') ci+=3;
            else ci -= 2;
            if(map.containsKey(ci) == false){
                map.put(ci, 0);
            }
        }
        return map.size();
    }
}
