import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (-1 to stop): ");
        int numInput = sc.nextInt();
        if (numInput == -1) {
            System.out.println("No numbers were entered.");
            return;
        }
        
        int Maximum = numInput;
        int Minimum = numInput;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            numInput = sc.nextInt();
            if (numInput == -1) {
                break;
            }
            if (numInput > Maximum) {
                Maximum = numInput;
            }
            
            if (numInput < Minimum) {
                Minimum = numInput;
            }
        }
        System.out.println();
        System.out.printf("Maximum = %d\n", Maximum);
        System.out.printf("Minimum = %d\n", Minimum);
    }
}
