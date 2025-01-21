import java.util.Scanner;
public class HeightConversion {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter height in centimeters: ");
       double heightCm = sc.nextDouble();
       double heightInches = heightCm / 2.54;
       int heightFeet = (int) (heightInches / 12);
       heightInches = heightInches % 12;
       System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
   }
}

