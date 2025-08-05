package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");
        String input = sc.nextLine();

        // Normalize the input: lowercase, remove punctuation
        input = input.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
