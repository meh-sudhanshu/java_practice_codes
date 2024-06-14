
class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,7,6,-76,-76,-87,-876,5,4,77,65,7};
        int searchValue = 77;
        boolean ans = false;
        for(int e : arr){
            if(e == searchValue){
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}