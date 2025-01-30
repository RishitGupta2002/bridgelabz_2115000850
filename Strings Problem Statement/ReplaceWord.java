import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (sentence == null || oldWord == null || newWord == null) {
            throw new IllegalArgumentException("Input values cannot be null");
        }
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = scanner.nextLine();

        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated Sentence: " + updatedSentence);

        scanner.close();
    }
}
