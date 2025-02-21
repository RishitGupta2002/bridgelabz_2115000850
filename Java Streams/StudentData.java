import java.io.*;

public class StudentData {
    public static void main(String[] args) {
        String fileName = "students.dat";

     
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Anita");
            dos.writeDouble(3.9);

            dos.writeInt(102);
            dos.writeUTF("Ankit");
            dos.writeDouble(3.7);

            System.out.println("Student data saved.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

     
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
