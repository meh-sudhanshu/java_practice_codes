class Reverse{
    public static void main(String[] args) {
        int num = 34567 ,result = 0,temp = num ,count = 0;

        while(num !=0){
            int rem = num % 10;
            result = result * 10 + rem;
            num = num /10;
            count++;
        }

        System.out.println(result);
        System.out.println(temp % count);
    }
}