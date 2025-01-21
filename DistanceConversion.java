import java.util.Scanner;
public class DistanceConversion {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter distance in feet: ");
       double distanceInFeet = sc.nextDouble();
       double distanceInYards = distanceInFeet / 3;
       double distanceInMiles = distanceInFeet / 5280;
       System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
   }
}

