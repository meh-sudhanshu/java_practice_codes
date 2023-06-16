import java.util.ArrayList;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<100;i++){
            int randomNumber = random.nextInt(5000);
            arr.add(randomNumber);
        }
        Integer largestNumber = Integer.MIN_VALUE;
        
        for(int val : arr){
            if(val > largestNumber){
                largestNumber = val;
            }
        }
        System.out.println(largestNumber );
    }
}


// write a java program to reverse an arraylist in place