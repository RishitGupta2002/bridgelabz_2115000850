import java.util.Scanner;
public class TrigonometricFunctionsCalculator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the angle in degrees:");
       double angle = sc.nextDouble();
      
       double[] trigFunctions = calculateTrigonometricFunctions(angle);
       System.out.println("Sine: " + trigFunctions[0]);
