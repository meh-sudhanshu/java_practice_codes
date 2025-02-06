class Sbi {
    private int accountBalance = 76543;

    public int getAccountBalance(String name) {
        if(name == "sudhanshu")
            return accountBalance;
        return -1;
    }
    public void setAccountBalance(int updatedBalance, String name){
        if(name == "sudhanshu")
            accountBalance = updatedBalance;
    }
}
