import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MostFrequentCharacter {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string:");
       String str = sc.nextLine();
       char mostFrequent = ' ';
       int maxCount = 0;
       Map<Character, Integer> frequencyMap = new HashMap<>();
       for (char c : str.toCharArray()) {
           frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
           if (frequencyMap.get(c) > maxCount) {
               maxCount = frequencyMap.get(c);
               mostFrequent = c;
           }
       }
       System.out.println("Most Frequent Character: '" + mostFrequent + "'");
   }
}

