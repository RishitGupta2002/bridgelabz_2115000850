import java.util.Scanner;
public class HandshakesDirect {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of students:");
       int numberOfStudents = sc.nextInt();
      
       int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
       System.out.println("The maximum number of possible handshakes is: " + handshakes);
   }
}

