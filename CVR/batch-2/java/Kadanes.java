class Kadanes {
    public static void main(String[] args) {
        int[] arr = {11,2,-4,5,-6,7,4,-40,3,4,5};
        int i=0;
        while(arr[i]<0){
            i++;
        }
        int maxSum = 0;
        int currentSum = arr[i];
        for(int j=i+1;j<arr.length;j++){
            if(arr[j] >=0){
                currentSum+=arr[j];
            }else{
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    currentSum+=arr[j];
                }
            }
        }
        System.out.println(Math.max(currentSum,maxSum));

    }
}
