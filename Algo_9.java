import java.util.Scanner;

public class Algo_9 {

private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String word;
        
        do {
            System.out.print("Enter a single word: ");
            word = scanner.nextLine().trim();
        } while (word.contains(" "));
        
        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }

    }
}


