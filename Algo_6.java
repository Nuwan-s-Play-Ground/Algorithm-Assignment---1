import java.util.Scanner;

public class Algo_6 {

    private final static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        do{
            System.out.print("Enter a sentence (ASCII characters only): ");
            String input = scanner.nextLine();
            
            if (!input.isEmpty()) {
                String[] words = input.split(" ");
                
                for (int i = words.length - 1; i >= 0; i--) {
                    System.out.print(words[i]);
                    if (i > 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Input is empty.");
            }
        }while(true);
    }
    
}
