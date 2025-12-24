
import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter password: ");
            String userInput = sc.nextLine();
            if (userInput.equals("PASS2025")) {
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
        
    }
}
