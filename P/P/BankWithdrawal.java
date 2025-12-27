package P;

import java.util.*;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        System.out.print("Enter withdrawal amount: ");
        try {
            String input = sc.nextLine();
            double amount = Double.parseDouble(input);
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter a numeric value");
        }
        sc.close();
    }
}