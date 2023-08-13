import java.util.Scanner;

public class Algo_1 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do{
            int number;
            do {
                System.out.print("Please enter a number: ");
                number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } while (number <= 0);

            int a = 0, b = 1;
            System.out.print("Fibonacci sequence up to " + number + ": " + a + " ");
            while (b <= number) {
                System.out.print(b + " ");
                int next = a + b;
                a = b;
                b = next;        
           }
        }while(true);
    }
}
