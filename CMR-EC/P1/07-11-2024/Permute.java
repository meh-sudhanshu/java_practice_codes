public class Permute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<ArrayList<Integer>> ans = permute(arr);
        System.out.println(ans);
    }
        
    private static ArrayList<ArrayList<Integer>> permute(int[] arr) {
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        if (arr.length == 1) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(arr[0]);
            ans.add(curr);
            return ans;
        }
        for(int i = 0; i<arr.length;i++){
            int fixedElement = arr[i];
            int[] currArr = new int[arr.length-1];
            int cIndex = 0;
            for(int j=0;j<arr.length;j++){
                if(i != j){
                    currArr[cIndex]= arr[j];
                    cIndex++;
                }
            }
            ArrayList<ArrayList<Integer>> allPermuation = permute(currArr);
            for(int i1=0;i1<allPermuation.size();i1++){
                //ans.add(allPermuation.get(i1).add(fixedElement));
                ArrayList<Integer> curr = allPermuation.get(i1);
                curr.add(fixedElement);
                ans.add(curr);
            }
        }

        return ans;

    }
}
