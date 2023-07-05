class Reverse{
    public static void main(String[] args) {
        int num = 6789;
        int result = 0;
        int count = 0;
        int temp = num;
        while(num !=0){
            count++;
            int rem = num%10;
            result = result*10 + rem;
            num = num /10;
        }
        System.out.println("Revrsed number is "+" "+result);
        System.out.println("module with count of digit is "+" "+temp%count);
    }
}