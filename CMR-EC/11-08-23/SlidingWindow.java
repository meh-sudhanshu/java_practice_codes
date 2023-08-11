class SlidingWindow{
    public static void main(String[] args) {
        int[] arr = {1,6,4,8,-9,87,54,-9};
        int k = 3;
        int ans = 0;
        int i=0,j=k-1;

        while(j<arr.length){
            if(i==0){
                for(int k1=i;k1<=j;k1++){
                    ans+=arr[k1];
                }
                i++;
                j++;
            }else{
                ans = Math.max(ans,ans-arr[i-1]+arr[j]);
                i+=1;
                j+=1;
            }
        }
        System.out.println(ans);
    }
}