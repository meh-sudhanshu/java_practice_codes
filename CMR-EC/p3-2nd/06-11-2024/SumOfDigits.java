class SumOfDigits{
    public static void main(String[] args) {
        int num = 56734;
        int sum = 0;
        while (num > 0) {
            //sum+= num%10;
            sum = sum + num%10;
            //num = num / 10;
            num/=10;
        }
        System.out.println(sum);
    }
}