public class Encapsulation {
    static class Account{
        private int balance = 0;

        public int getBalance(){
            return this.balance;
        }

        public void setBalance(int balance){
            this.balance = balance;
        }

        public String withdrawBalance(int amount){
            if(amount > balance){
                return "Invaid input";
            }
            this.balance = this.balance - amount;

            return "remaining balance is "+balance;
        }
    }
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getBalance());
        account.setBalance(50000);
        System.out.println(account.getBalance()); 
    }
   
}
