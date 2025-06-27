
import java.util.*;

class Solution{

    public static ArrayList<ArrayList<Integer>> permute(int[] nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(nums.length == 1){
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(nums[0]);
            ans.add(curr);
            return ans;
        }
        for(int i = 0; i< nums.length; i++){
            int fe = nums[i];
            int[] sub = new int[nums.length-1];
            int index = 0;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    sub[index] = nums[j];
                    index+=1;
                }
            }
            ArrayList<ArrayList<Integer>> all = permute(sub);
            for(int k = 0; k < all.size(); k++){
                ArrayList<Integer> curr = all.get(k);
                curr.add(fe);
                ans.add(curr);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
}