


class UniqueNumber{
    public static void main(String[] args){
        int[] arr = {2,6,2,7,7,6,88,9,88};
        int ans = 0;
        for(int i = 0; i< arr.length; i++) ans = ans ^ arr[i];
        System.out.println(ans);
    }
}