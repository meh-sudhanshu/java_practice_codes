class TargetSum{
    public static void main(String[] args) {
        int[] arr = {10,2,5,2,-5,-56,19};
        int target = 7;
        int n = arr.length;
        boolean ans = false;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i != j) {
                    if(arr[i]+arr[j] == target){
                        ans = true;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}