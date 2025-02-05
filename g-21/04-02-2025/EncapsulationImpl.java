public class EncapsulationImpl {
    static class  Account {
        private int balance = 76543;

        public int getBalance(String name){
            if(name == "sudhanshu") return balance;
            return -1;
        }
        public void setBalance(int balance, String name){
            if(name == "sudhanshu"){
                this.balance = balance;
            }
        }
        
    }
}
