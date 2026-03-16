package gla.com.ClassAndObject.level2;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class ATM {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Diya", 12345, 5000);

        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.displayBalance();
    }
}
