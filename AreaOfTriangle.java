import java.util.Scanner;
public class AreaOfTriangle {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter base of the triangle: ");
       double base = sc.nextDouble();
       System.out.print("Enter height of the triangle: ");
       double height = sc.nextDouble();
       double areaSqInches = 0.5 * base * height;
       double areaSqCm = areaSqInches * 6.4516;
       System.out.println("The area of the triangle is " + areaSqInches + " square inches and " + areaSqCm + " square centimeters");
   }
}

