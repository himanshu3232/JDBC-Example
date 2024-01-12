class AtmMachine implements User {
    private int balance;
    AtmMachine(int balance){
        this.balance = balance;
    }
    AtmMachine(){}
    @Override
    public void withdraw(int amount) throws Exception {
        if(balance>=amount) balance -= amount;
        else throw new Exception("Balance is too low!");
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public int checkBalance() {
        return balance;
    }
}
