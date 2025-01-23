import java.util.Scanner;
public class SumOf_N_NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both results are " + (sum == formulaSum ? "correct" : "incorrect"));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
