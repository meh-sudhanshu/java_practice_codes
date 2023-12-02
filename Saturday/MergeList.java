public class MergeList {
    public static void main(String[] args) {
        int[] arr1 = {3,5,64,78,98};
        int[] arr2 = {1,4,8,9,10,77,89};
        int n = arr1.length+arr2.length;
        int[] arr3 = new int[n];
        int i=0, j=0, k=0;  
        while (i< arr1.length && j< arr2.length) {
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i+=1;
            }else{
                arr3[k] = arr2[j];
                j+=1;
            }
            k+=1;
        }

        while (i< arr1.length) {
            arr3[k]  = arr1[i];
            i+=1;
            k+=1;
        }
        while (j<arr2.length) {
            arr3[k] = arr2[j];
            j+=1;
            k+=1;
        }

        for(int e : arr3){
            System.out.print(e+" ");
        }
    }
}
