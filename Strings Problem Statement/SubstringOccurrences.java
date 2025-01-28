import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str = sc.nextLine();
        System.out.println("Enter the substring:");
        String subStr = sc.nextLine();
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("Occurrences of '" + subStr + "': " + count);
    }
}
