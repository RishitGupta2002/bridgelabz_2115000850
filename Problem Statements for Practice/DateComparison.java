import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       System.out.println("Enter the first date (dd/MM/yyyy):");
       String firstDateInput = sc.nextLine();
       LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
       System.out.println("Enter the second date (dd/MM/yyyy):");
       String secondDateInput = sc.nextLine();
       LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
       if (firstDate.isBefore(secondDate)) {
           System.out.println("The first date is before the second date.");
       } else if (firstDate.isAfter(secondDate)) {
           System.out.println("The first date is after the second date.");
       } else {
           System.out.println("The first date is the same as the second date.");
       }
   }
}

