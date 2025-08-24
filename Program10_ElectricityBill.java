import java.util.InputMismatchException;
import java.util.Scanner;

interface BillCalculator {
    double calculateBill(int units);
}

class ElectricityBoard implements BillCalculator {
    public double calculateBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        }
        return bill;
    }
}

public class Program10_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBoard board = new ElectricityBoard();

        try {
            System.out.print("Enter number of units: ");
            int units = sc.nextInt();
            double amount = board.calculateBill(units);
            System.out.println("Total Bill: ₹" + amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter a number.");
        }
    }
}
