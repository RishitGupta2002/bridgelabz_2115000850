import java.util.Scanner;
class TriangularParkRun {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the lengths of the three sides of the triangular park in meters:");
       double side1 = sc.nextDouble();
       double side2 = sc.nextDouble();
       double side3 = sc.nextDouble();
      
       double perimeter = side1 + side2 + side3;
       double distance = 5000; // 5 km in meters
       double rounds = distance / perimeter;
      
       System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
   }
}

