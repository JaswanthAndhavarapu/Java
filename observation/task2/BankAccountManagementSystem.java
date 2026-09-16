class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
            101, "Rahul", 10000, 5);

        CurrentAccount current = new CurrentAccount(
            102, "Arjun", 5000, 3000);

        System.out.println("BEFORE TRANSACTIONS");
        savings.displayAccountDetails();
        System.out.println();
        current.displayAccountDetails();

        System.out.println("\nTRANSACTIONS");

        savings.deposit(2000);
        savings.withdraw(1000);
        savings.calculateInterest();

        current.deposit(3000);
        current.withdraw(9000);

        savings.transfer(current, 2000);

        System.out.println("\nAFTER TRANSACTIONS");
        savings.displayAccountDetails();
        System.out.println();
        current.displayAccountDetails();

        System.out.println("\nFinal Balance of Savings Account: "
                           + savings.balance);

        System.out.println("Final Balance of Current Account: "
                           + current.balance);
    }
}
