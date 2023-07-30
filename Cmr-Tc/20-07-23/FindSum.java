public class FindSum {
    public static void main(String[] args) {
        int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
        System.out.println(findSumOfPrimes(arr,arr.length));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {return false; }
        if (number == 2) { return true; }
        if (number % 2 == 0) {return false;}
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
    }
    public static int findSumOfPrimes(int[] input, int input2){
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int maxVlue = Integer.MIN_VALUE;
        int count = 0;
        for(int e : input){
            if(e > maxVlue){
                maxVlue = e;
            }
            if(isPrime(e)){
                count+=1;
                ans+=e;
                if(e > max){
                    max = e;
                }
            }
        }
        if(count == 0){
            int sum = 0;
            for(int e : input){sum+=e;
            }
            return sum - maxVlue;
        }
        return (ans-max);
    }
}
