import java.util.Scanner;

public class Algo_5 {

    private final static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter a text (ASCII only): ");
        String input = scanner.nextLine();
        
        if (!input.isEmpty()) {
            char[] charArray = input.toCharArray();
            int length = charArray.length;
            
            for (int i = 0; i < length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[length - 1 - i];
                charArray[length - 1 - i] = temp;
            }
            
            String reversedText = new String(charArray);
            System.out.println("Reversed text: " + reversedText);
        } else {
            System.out.println("Input is empty.");
        }
    }
}
