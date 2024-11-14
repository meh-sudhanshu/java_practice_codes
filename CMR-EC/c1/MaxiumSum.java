import java.util.HashMap;

public class MaxiumSum {
    public static void main(String[] args) {
        int[] arr = {-2,5,2,7,3,98,56,56,-100,3,98,56,98};
        int k = 3;
        int ans = getMaximumSubarrySumWithKDistinctElement(arr,k);
        System.out.println(ans);
    }
    private static int getMaximumSubarrySumWithKDistinctElement
    (int[] arr, int k){
        int i =0, j = k-1;
        int ans = Integer.MIN_VALUE;
        HashMap<Integer,Integer> myMap = new HashMap<>();
        int preSum = 0;
        while (j < arr.length) {
            int sum = 0;
            if(i == 0){
                for(int l=i;l<=j;l++){
                    sum+=arr[l];
                    myMap.put(arr[l],myMap.getOrDefault(arr[l],0)+1);
                }
                preSum = sum;
            }else{
                sum = preSum - arr[i-1] + arr[j];
                preSum = sum;
                int removedElement = arr[i-1];
                int newElement = arr[j];
                myMap.put(newElement,
                    myMap.getOrDefault(newElement,0)+1
                );
                if(myMap.get(removedElement) == 1){
                    myMap.remove(removedElement);
                }else{
                    myMap.put(removedElement,myMap.get(removedElement)-1);
                }
            }
            if(myMap.size() == k){
                if(sum > ans){
                    ans = sum;
                }
            }
            i+=1;
            j+=1;
        }



        return ans;
    }
}
