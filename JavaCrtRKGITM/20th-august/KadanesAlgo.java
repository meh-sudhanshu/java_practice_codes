

class KadanesAlgo{
      public static void main(String[] sudhanshu){
        int[] arr = {1,2,-8,-9,-5,6,-8};
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            sum+=arr[i];
            if(sum > ans) ans = sum;
            if(sum < 0) sum = 0;
        }
        System.out.println(ans);
       
    }
}