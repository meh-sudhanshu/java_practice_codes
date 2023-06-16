import java.util.Random;

class Random1{
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        // if(randomNumber == 6){
        //     System.out.println(randomNumber);
        // }
        // while(randomNumber !=6){
        //     randomNumber = random.nextInt(10)+1;
        //     System.out.println(randomNumber);
        // }

        do{
            System.out.println(randomNumber);
            if(randomNumber !=6){
                randomNumber = random.nextInt(10)+1;
            }
        }while(randomNumber!=6);
        
    }
}

// create an arraylist and insert 100 random numbers in that , 
//fetch the largest one

// generate the number between 1 to 5000