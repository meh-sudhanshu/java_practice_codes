public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {-3,-1,2,4,8};

        int[] sortedArray = mergeSortedArray(arr1,arr2);
        for(int e : sortedArray){
            System.out.print(e+" ");
        }
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
       int[] ans = new int[arr1.length+arr2.length];
       int i=0,j=0,k=0;
       while (i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
       }

       if(i < arr1.length){
        while (i<arr1.length) {
            ans[k] = arr1[i];
            i++;k++;
        }
       }

       if(j < arr2.length){
        while (j<arr2.length) {
            ans[k]=arr2[j];
            k++;j++;
        }
       }
       return ans;
    }
}
