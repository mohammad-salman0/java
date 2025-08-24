import java.util.Scanner;

interface TemperatureConverter {
    double celsiusToFahrenheit(double c);
    double fahrenheitToCelsius(double f);
}

class Converter implements TemperatureConverter {
    public double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }
}

public class Program9_TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter conv = new Converter();

        try {
            System.out.print("Enter Celsius: ");
            double c = Double.parseDouble(sc.nextLine());
            System.out.println("In Fahrenheit: " + conv.celsiusToFahrenheit(c));

            System.out.print("Enter Fahrenheit: ");
            double f = Double.parseDouble(sc.nextLine());
            System.out.println("In Celsius: " + conv.fahrenheitToCelsius(f));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number input.");
        }
    }
}
