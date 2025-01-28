import java.util.Scanner;
public class EmployeeBonus {
    public static double[][] getSalariesAndYearsOfService(int numEmployees) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    public static double[][] calculateNewSalariesAndBonuses(double[][] data) {
        int numEmployees = data.length;
        double[][] results = new double[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
            double salary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            double newSalary = salary + bonus;
            results[i][0] = newSalary;
            results[i][1] = bonus;
        }
        return results;
    }

    public static void displayResults(double[][] data, double[][] results) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears of Service\tNew Salary\tBonus");
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double yearsOfService = data[i][1];
            double newSalary = results[i][0];
            double bonus = results[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t\t%.2f\t\t%.0f\t\t\t%.2f\t\t%.2f%n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        double[][] data = getSalariesAndYearsOfService(numEmployees);
        double[][] results = calculateNewSalariesAndBonuses(data);

        displayResults(data, results);
    }
}
