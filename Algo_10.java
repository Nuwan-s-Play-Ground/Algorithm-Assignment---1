import java.util.Scanner;

public class Algo_10 {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String phoneNumber;
        boolean isValid = false;

        do {
            System.out.print("Enter a phone number (+94 XX XXX XXXX or 0XX-XXXXXXX): ");
            phoneNumber = scanner.nextLine().trim();

            if (phoneNumber.isEmpty()) {
                System.out.println("Telephone number can't be empty. Please enter it again.");
            } else {
                if ((phoneNumber.startsWith("+94 ") && phoneNumber.length() == 15) ||
                    (phoneNumber.startsWith("0") && phoneNumber.contains("-") && phoneNumber.length() == 11)) {

                    isValid = true;
                    for (int i = (phoneNumber.startsWith("+94 ") ? 4 : 1); i < phoneNumber.length(); i++) {
                        char c = phoneNumber.charAt(i);
                        if (!Character.isDigit(c) && c != ' ' && c != '-') {
                            isValid = false;
                            break;
                        }
                    }

                    if (isValid) {
                        System.out.println("Number is validated.");
                    } else {
                        System.out.println("Invalid phone number. Please enter it again.");
                    }
                } else {
                    System.out.println("Invalid phone number format. Please enter it again.");
                }
            }
        } while (!isValid);

        scanner.close();
    }
}



