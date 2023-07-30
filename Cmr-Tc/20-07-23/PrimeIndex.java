import java.util.HashMap;

public class PrimeIndex {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(sumOfPrimeIndex(arr,10));
        HashMap<Long,Integer> map = new HashMap<>();

       
    }

    private static int sumOfPrimeIndex(int[] input, int input2) {
        int ans = 0;
        for(int i=0;i<input.length;i++){
            if(!isPrime(i)){
                ans+=input[i];
            }
        }

        return ans;
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
}
