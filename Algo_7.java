import java.util.Scanner;

public class Algo_7 {

    private final static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        if (!input.isEmpty()) {
            
            String[] words = input.split(" ");
            String shortestWord = words[0];
            String longestWord = words[0];
            
            for (String word : words) {
                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Shortest word: " + shortestWord + " (Length: " + shortestWord.length() + ")");
            System.out.println("Longest word: " + longestWord + " (Length: " + longestWord.length() + ")");

        } else {
            System.out.println("Input is empty.");
        }

    }

}
