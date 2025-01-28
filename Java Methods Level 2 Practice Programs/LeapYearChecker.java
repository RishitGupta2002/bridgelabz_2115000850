import java.util.Scanner;
public class LeapYearChecker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int year = sc.nextInt();
      if (year < 1582) {
         System.out.println("The LeapYear program only works for year >= 1582.");
         return;
      }
      boolean isLeapYear = checkLeapYear(year);
      System.out.println("The year " + year + " is " + (isLeapYear ? "a Leap Year." : "not a Leap Year."));
   }

   public static boolean checkLeapYear(int year) {
      return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }
}

