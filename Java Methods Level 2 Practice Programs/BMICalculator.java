import java.util.Scanner;
public class BMICalculator {
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
        return data;
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows and 3 columns

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        data = calculateBMI(data);
        String[] status = determineBMIStatus(data);

        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n", data[i][1], data[i][0], data[i][2], status[i]);
        }
    }
}
