
  class Account{
        private int balance = 0;
        private boolean isKycDone = false;
        public void doKyc(){
            this.isKycDone = true;
        }
        public boolean getKycStatus(){
            return this.isKycDone;
        }
        public int getBalance(){
            return balance;
        }
        public void setBalance(int value){
            this.balance = value;
        }
    }
public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getBalance());
        account.setBalance(5000);
        System.out.println(account.getBalance());
    }
}
