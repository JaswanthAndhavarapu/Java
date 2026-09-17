interface PaymentService {
    void pay(String receiverUPI, double amount)
        throws InvalidUPIException, InvalidAmountException,
        InsufficientBalanceException;

    void checkBalance();
}

class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    Wallet(String userName, String mobileNumber, String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    void addMoney(double amount) {
        balance = balance + amount;
    }

    double getBalance() {
        return balance;
    }

    void displayWalletDetails() {
        System.out.println("\n--- Wallet Details ---");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : Rs." + balance);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
            InsufficientBalanceException {

        if (!receiverUPI.contains("@") ||
            receiverUPI.endsWith("@")) {
            throw new InvalidUPIException("Invalid UPI ID.");
        }

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Payment amount must be greater than zero.");
        }

        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                "Insufficient wallet balance.");
        }

        double remainingBalance = wallet.getBalance() - amount;

        wallet = new Wallet(
            "Jaswanth",
            "9876543210",
            "jaswanth@upi",
            remainingBalance
        );

        System.out.println("Payment Successful.");
        System.out.println("Paid Amount  : Rs." + amount);
        System.out.println("Receiver UPI : " + receiverUPI);
    }

    public void checkBalance() {
        System.out.println("Available Balance : Rs." + wallet.getBalance());
    }
}

public class DigitalWallet {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(
            "Jaswanth",
            "9876543210",
            "jaswanth@upi",
            5000
        );

        wallet.addMoney(2000);

        PaymentService payment = new UPIPayment(wallet);

        wallet.displayWalletDetails();

        System.out.println("\n--- UPI Payment ---");

        try {
            payment.pay("shop@upi", 1500);
        }
        catch (InvalidUPIException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
        catch (InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction processing completed.");
        }

        System.out.println("\n--- Balance Check ---");
        payment.checkBalance();

        System.out.println("\n--- Final Wallet Details ---");
        wallet.displayWalletDetails();
    }
}
