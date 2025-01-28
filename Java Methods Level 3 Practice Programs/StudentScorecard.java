import java.util.Scanner;

public class StudentScorecard {
    public static int[][] inputScores(int numStudents) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            scores[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            scores[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            scores[i][2] = sc.nextInt();
        }

        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] scores = inputScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}