import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Program2_BankAccountOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();

        try {
            System.out.print("Enter deposit amount: ");
            double dep = Double.parseDouble(sc.nextLine());
            acc.deposit(dep);

            System.out.print("Enter withdrawal amount: ");
            double with = Double.parseDouble(sc.nextLine());
            acc.withdraw(with);

            System.out.println("Current Balance: " + acc.getBalance());

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}
