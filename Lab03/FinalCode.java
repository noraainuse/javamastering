
import java.util.Scanner;

public class FinalCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int digitsLoop = sc.nextInt();
        String codeFinal = "";
        for (int i = 1; i <= digitsLoop; i++) {
            System.out.printf("Enter digit %d: ", i);
            char userInput = sc.next().charAt(0);
            codeFinal += userInput;
        }
        sc.close();
        System.out.println();
        System.out.printf("Final Code = %s\n", codeFinal);
    }
}
