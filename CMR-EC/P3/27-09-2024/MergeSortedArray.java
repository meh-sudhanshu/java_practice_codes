import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {-3,5,8,9,12,18,20,22,29};
        int[] arr2 = {-5,-1,9,12,118,120};
        int[] ans = mergeTwoSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] mergeTwoSortedArray(int[] arr1,int[] arr2){
        int i = 0, j = 0, k = 0;
        int n1 = arr1.length, n2 = arr2.length;
        int[] ans = new int[n1+n2];
        while (i < n1 && j < n2) {
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

        while (i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = arr2[j];
            k++;
            j++;
        }

        return ans;
    }
}
