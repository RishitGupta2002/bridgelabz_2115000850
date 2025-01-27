import java.util.Scanner;
public class QuotientAndRemainder {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the dividend:");
       int number = sc.nextInt();
       System.out.println("Enter the divisor:");
       int divisor = sc.nextInt();
      
       int[] result = findRemainderAndQuotient(number, divisor);
       System.out.println("The quotient is: " + result[0]);
       System.out.println("The remainder is: " + result[1]);
   }
  
   public static int[] findRemainderAndQuotient(int number, int divisor) {
       int quotient = number / divisor;
       int remainder = number % divisor;
       return new int[]{quotient, remainder};
   }
}

