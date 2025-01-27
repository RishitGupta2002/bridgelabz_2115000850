import java.util.Scanner;
public class ChocolatesDistribution {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of chocolates:");
       int numberOfChocolates = sc.nextInt();
       System.out.println("Enter the number of children:");
       int numberOfChildren = sc.nextInt();
      
       int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
       System.out.println("Each child will get " + result[0] + " chocolates.");
       System.out.println("Remaining chocolates: " + result[1]);
   }
  
   public static int[] findRemainderAndQuotient(int number, int divisor) {
       int quotient = number / divisor;
       int remainder = number % divisor;
       return new int[]{quotient, remainder};
   }
}



