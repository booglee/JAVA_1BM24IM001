package P;
import java.util.*;

class Account {
    String customerName, accountNumber, type;
    double balance;

    Account(String customerName, String accountNumber, String type, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance - amount < 1000) {
            balance -= 100;
            System.out.println("Penalty imposed");
        } else {
            balance -= amount;
        }
    }
}

class CurAcct extends Account {
    CurAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }
}

class SavAcct extends Account {
    SavAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    void computeInterest() {
        double interest = balance * 0.05;
        deposit(interest);
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter type (Savings/Current): ");
        String type = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();
        Account acc;
        if (type.equalsIgnoreCase("Savings")) {
            acc = new SavAcct(name, accNo, bal);
        } else {
            acc = new CurAcct(name, accNo, bal);
        }
        acc.deposit(2000);
        acc.displayBalance();
        if (acc instanceof SavAcct) {
            ((SavAcct) acc).computeInterest();
        }
        acc.displayBalance();
        acc.withdraw(1500);
        acc.displayBalance();
        sc.close();
    }
}