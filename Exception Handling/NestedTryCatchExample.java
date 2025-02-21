import java.util.*;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an index: ");
        try {
            int index = scanner.nextInt();
            try {
                System.out.println("Enter a divisor: ");
                int divisor = scanner.nextInt();
                int result = array[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
