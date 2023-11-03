public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,17,34,56,78};
        int[] arr2 = {-2,4,15,17,117,134,156,178};
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr1.length+arr2.length];

    
        while (i< arr1.length || j < arr2.length) {

            if(i >= arr1.length){
                while (j < arr2.length) {
                    ans[k] = arr2[j];
                    k++;
                    j++;
                }
            }else if(j >= arr2.length){
                while (i < arr1.length) {
                    ans[k] = arr1[i];
                    k++;
                    i++;
                }
            }else{
                if(arr1[i] < arr2[j]){
                    ans[k] = arr1[i];
                    i++;
                    k++;
                }else{
                    ans[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }

        for(int e : ans) System.out.print(e+" ");
    }

}
