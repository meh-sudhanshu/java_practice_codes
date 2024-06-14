import java.util.ArrayList;
import java.util.Collections;

class BinaryCount {
    public static void  main(String[] args) {
        // -6,2,5,-2,-7,-1,3
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-6);
        arr.add(2);
        arr.add(5);
        arr.add(-2);
        arr.add(-7);
        arr.add(-1);
        arr.add(3);
        int target = -2;
        
        int ans = 0;
        Collections.sort(arr);
        // System.out.println(arr+" sorted array");
        for(int i=0;i<arr.size();i++){
            int newTarget = target-arr.get(i);
            System.out.println(newTarget+" new target");
            ans+=binaryCount(arr,newTarget,i+1,arr.size()-1);
        }
       System.out.println(ans);
    }
    public static int binaryCount(ArrayList<Integer> arr, int newTarget,int si, int ei){
        System.out.println(arr);
        int ans = ei-si+1;
        while(si <= ei){
            int mid = (si+ei)/2;
            if(arr.get(mid) >= newTarget){
                ei = mid-1;
                ans = ans - (ei-si+1);
            }else if(arr.get(mid) < newTarget){
                si=mid+1;
            }
        }
        return ans;
    }
}