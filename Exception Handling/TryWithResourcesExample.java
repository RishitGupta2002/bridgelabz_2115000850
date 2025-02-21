import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        File file = new File("info.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String firstLine = reader.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
