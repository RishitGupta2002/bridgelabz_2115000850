import java.util.Scanner;
public class NumberChecker2 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static int[] storeDigits(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }
    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = storeDigits(number);
        System.out.println("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit Frequency: ");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
