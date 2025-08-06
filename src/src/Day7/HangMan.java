package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wrongguesses = 0;
        String word = "pizza";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add('_');
        }
        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while (wrongguesses <= 6) {
            System.out.println(gethangman(wrongguesses));
            System.out.print("Wrod : ");
            for (char c : list) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess a letter : ");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0) {
                System.out.println("correct guess");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        list.set(i, guess);
                    }
                    if (!list.contains('_')) {
                        System.out.println(gethangman(wrongguesses));
                        System.out.println("You Guessed Correctly");
                        System.out.println("The Correct word is: " + word);
                        break;
                    }

                }


            } else {
                wrongguesses++;
                System.out.println("incorrect guess");
            }
        }
        if (wrongguesses >= 6) {
            System.out.println("Gane Over...");
            System.out.println("The Correct Word is -->" + word);
        }

    }

    static String gethangman(int wrongguesses) {
        return switch (wrongguesses) {
            case 0 -> """
                    
                    
                    """;
            case 1 -> """
                     O
                    
                    """;
            case 2 -> """
                     O
                     |
                    
                    """;
            case 3 -> """
                     O
                    /|
                    
                    """;
            case 4 -> """
                     O
                    /|\\
                    
                    """;
            case 5 -> """
                     O
                    /|\\
                    /
                    """;
            case 6 -> """
                     O
                    /|\\
                    / \\
                    """;
            default -> "";

        };
    }
}
