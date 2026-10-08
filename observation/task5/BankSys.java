// Bank Account System using OOP

class Account {
    int no;
    String name, type;
    double bal;

    Account(int no, String name, double bal, String type) {
        this.no = no;
        this.name = name;
        this.bal = bal;
        this.type = type;
    }

    void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited: " + amt);
        }
    }

    void withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(Account a, double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            a.bal += amt;
            System.out.println("Transferred: " + amt);
        } else {
            System.out.println("Transfer failed");
        }
    }

    void show() {
        System.out.println("No     : " + no);
        System.out.println("Name   : " + name);
        System.out.println("Type   : " + type);
        System.out.println("Balance: " + bal);
    }
}

class Savings extends Account {
    double rate;

    Savings(int no, String name, double bal, double rate) {
        super(no, name, bal, "Savings");
        this.rate = rate;
    }

    void interest() {
        double in = bal * rate / 100;
        bal += in;
        System.out.println("Interest: " + in);
    }
}

class Current extends Account {
    double od;

    Current(int no, String name, double bal, double od) {
        super(no, name, bal, "Current");
        this.od = od;
    }

    @Override
    void withdraw(double amt) {
        if (amt > 0 && amt <= bal + od) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankSys{
    public static void main(String[] args) {

        Savings s = new Savings(102, "Manu", 100000, 5);
        Current c = new Current(103, "Bennu", 50000, 3000);

        System.out.println("=== SAVINGS ===");
        s.show();
        s.deposit(2000);
        s.withdraw(1000);
        s.interest();

        System.out.println("\n=== CURRENT ===");
        c.show();
        c.deposit(3000);
        c.withdraw(9000);

        System.out.println("\n=== TRANSFER ===");
        s.transfer(c, 2000);

        System.out.println("\n=== FINAL ===");
        s.show();
        c.show();
    }
}
