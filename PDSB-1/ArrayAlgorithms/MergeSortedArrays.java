package ArrayAlgorithms;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {-2,-1,23,45,47,56,76};
        int[] arr2 = {-9,0,3,4,23,24,35,46,67};
        int[] ans = mergeSortedArrays(arr1,arr2);
        for(int e : ans){
            System.out.print(e+" ");
        }  
    }
    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length , n2 = arr2.length;
        int[] ans = new int[n1+n2];
        int i =0,j=0,k=0;
        while (i<n1 && j<n2) {
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k] = arr2[j];
                j++;
            }

            k++;
        }
        while (j< n2) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        while (i<n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        return ans;
    }
}
