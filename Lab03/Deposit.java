import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int depositAmount = 0;
        int depositCount = 0;
        while (true) {
            System.out.print("Enter deposit amount: ");
            int userDeposit = sc.nextInt();
            depositAmount += userDeposit;
            depositCount += 1;
            if (depositAmount >= 1000) {
                System.out.println();
                System.out.println("Target reached!");
                System.out.printf("Total amount saved = %d\n", depositAmount);
                System.out.printf("Number of deposits = %d\n", depositCount);
                break;
            }
        }
    }
}
