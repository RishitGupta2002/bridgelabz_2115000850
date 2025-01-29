import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = sc.nextDouble();
        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
        int choice = sc.nextInt();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
