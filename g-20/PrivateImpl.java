public class PrivateImpl {
    class MyAccount{
        private double accountBalance = 43987.34;
        public double getAccountBalance(String name){
            if(name == "sudhanshu"){
                return accountBalance;
            }
            return -1.0;
        }
        public void setAccountBalance(double updatedBalance,
            String name
        ){
            if(name == "sudhanshu")
                accountBalance = updatedBalance;
        }
    }
}
