public class App {

    // Deposit method
    public int deposit(int balance, int amount) {
        return balance + amount;
    }

    // Withdraw method
    public int withdraw(int balance, int amount) {
        if (amount > balance) {
            return balance; // no overdraft
        }
        return balance - amount;
    }

    // Check balance
    public int checkBalance(int balance) {
        return balance;
    }

    public static void main(String[] args) {
        App bank = new App();

        int balance = 1000;

        balance = bank.deposit(balance, 500);
        System.out.println("After deposit: " + balance);

        balance = bank.withdraw(balance, 300);
        System.out.println("After withdrawal: " + balance);

        System.out.println("Final Balance: " + bank.checkBalance(balance));
    }
}