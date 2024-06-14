class LinerSearch{
    public static void main(String[] args){
        int[] arr = {3,2,5,2,87,65,54,98,90};
        int searchValue = 54;
        boolean ans = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchValue){
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}