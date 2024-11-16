import java.util.HashMap;

class MaximumSubarraySum{
    public static void main(String[] args) {
        int[] arr = {8,18,18,8,2,8,8,-18,18,9,18};
        int k = 3;
        int ans = getMaximumSubarraySumOfSizeKWithKDictinctElment
                    (arr,k);
        System.out.println(ans);
    }


    private static int getMaximumSubarraySumOfSizeKWithKDictinctElment
    (int[] arr, int k){
            int i = 0, j = k-1;
            int ans = Integer.MIN_VALUE;
            int cs = 0, ps = 0;
            HashMap<Integer,Integer> myMap = new HashMap<>();
            while (j < arr.length) {
                cs = 0;
                if (i == 0) {
                    for(int l = i; l<=j; l++){
                        cs+=arr[l];
                        if(myMap.containsKey(arr[l])){
                            int value = myMap.get(arr[l]);
                            value = value +1;
                            myMap.put(arr[l],value);
                        }else{
                            myMap.put(arr[l],1);
                        }
                    }
                    ps = cs;
                }else{
                    cs = ps - arr[i-1] + arr[j];
                    ps = cs;
                    int removedElement = arr[i-1];
                    int addedElement = arr[j];
                    if(myMap.get(removedElement) == 1){
                        myMap.remove(removedElement);
                    }else{
                        int value = myMap.get(removedElement);
                        value = value - 1;
                        myMap.put(removedElement,value);
                    }

                    if(myMap.containsKey(addedElement)){
                        int value = myMap.get(addedElement);
                        value = value + 1;
                        myMap.put(addedElement,value);
                    }else{
                        myMap.put(addedElement,1);
                    }
                }
                if(myMap.size() == k && cs > ans){
                    ans = cs;
                }
                i+=1;
                j+=1;
            }
            return ans;
        }
}