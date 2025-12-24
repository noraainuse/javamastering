import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowelsArray = {'a','e','i','o','u'};
        boolean found = false;
        String charEnd = new String();
        String Consonants = new String();
        while (true) {
            found = false;
            System.out.print("Enter a character: ");
            char userInput = sc.next().charAt(0);
            if (userInput == 'z') {
                System.out.println();
                System.out.printf("All characters entered: %s\n", charEnd);
                System.out.printf("Consonants only: %s\n", Consonants);
                break;
            }
            if (Character.isLowerCase(userInput)) {
                for (char vowels: vowelsArray) {
                    if (vowels == userInput) {
                        found = true;
                        break;
                    }
                }
                charEnd += userInput;
                
                if (found == false) {
                    Consonants += userInput;
                }
            } else {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
        }
    }
}
