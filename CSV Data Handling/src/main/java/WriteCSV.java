import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String csvFile = "src/main/resources/employees.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
            String[] header = { "ID", "Name", "Department", "Salary" };
            writer.writeNext(header);

          
            String[] employee1 = { "1", "Alice Johnson", "HR", "55000" };
            String[] employee2 = { "2", "Bob Smith", "IT", "65000" };
            String[] employee3 = { "3", "Charlie Brown", "Finance", "60000" };
            String[] employee4 = { "4", "Daisy Miller", "Marketing", "62000" };
            String[] employee5 = { "5", "Evan Davis", "Sales", "58000" };

            writer.writeNext(employee1);
            writer.writeNext(employee2);
            writer.writeNext(employee3);
            writer.writeNext(employee4);
            writer.writeNext(employee5);

            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
