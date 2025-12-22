
import java.util.Scanner;

public class EnterNumitem {
    public static void main(String[] args) {
        int totalPrice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int numItem = sc.nextInt();
        for (int i = 1; i <= numItem; i++) {
            System.out.print("Enter price for item " + i + ": ");
            int priceInput = sc.nextInt();
            totalPrice += priceInput;
        }
        System.out.printf("Total = %d\n\n", totalPrice);
        System.out.print("Enter amount paid: ");
        int amountPaid = sc.nextInt();
        sc.close();
        System.out.printf("Change = %d\n", amountPaid - totalPrice);
    }
}
