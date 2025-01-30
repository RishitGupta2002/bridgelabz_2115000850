import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.nextLine().charAt(0);
        String modifiedStr = str.replaceAll(Character.toString(charToRemove), "");

        System.out.println("Modified String: " + modifiedStr);
    }
}
