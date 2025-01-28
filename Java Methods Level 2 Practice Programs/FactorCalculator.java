import java.util.Scanner;
import java.util.Arrays;
public class FactorCalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      int[] factors = findFactors(number);
      System.out.println("Factors: " + Arrays.toString(factors));
      System.out.println("Sum of factors: " + sumOfFactors(factors));
      System.out.println("Product of factors: " + productOfFactors(factors));
      System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
   }
   public static int[] findFactors(int number) {
      int count = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            count++;
         }
      }
      int[] factors = new int[count];
      int index = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            factors[index++] = i;
         }
      }
      return factors;
   }
   public static int sumOfFactors(int[] factors) {
      int sum = 0;
      for (int factor : factors) {
         sum += factor;
      }
      return sum;
   }
   public static int productOfFactors(int[] factors) {
      int product = 1;
      for (int factor : factors) {
         product *= factor;
      }
      return product;
   }
   public static int sumOfSquaresOfFactors(int[] factors) {
      int sum = 0;
      for (int factor : factors) {
         sum += Math.pow(factor, 2);
      }
      return sum;
   }
}
