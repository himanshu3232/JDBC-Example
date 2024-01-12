class Main {
    public static void main(String[] args) {
        AtmMachine user1 = new AtmMachine();
        AtmMachine user2 = new AtmMachine(1000);
        //Check initial balance
        System.out.println(user1.checkBalance());
        System.out.println(user2.checkBalance());

        try{
            user1.withdraw(100);
            user2.withdraw(1000);
        }
        catch (Exception e){
            System.out.println("Balance is too low!");
        }
        finally {
            user1.deposit(1000);
            user2.deposit(500);
            System.out.println(user1.checkBalance());
            System.out.println(user2.checkBalance());
        }
    }
}
