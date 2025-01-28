import java.util.Scanner;
public class FriendsComparison {
    public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        for (int age : ages) {
            if (age < minAge) {
                minAge = age;
            }
        }
        return minAge;
    }
    public static double findTallest(double[] heights) {
        double maxHeight = heights[0];
        for (double height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];        
        String[] names = {"Amar", "Akbar", "Anthony"};        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }        
        int youngest = findYoungest(ages);
        double tallest = findTallest(heights);
        System.out.println("The youngest friend is " + youngest + " years old.");
        System.out.println("The tallest friend is " + tallest + " cm tall.");
    }
}
