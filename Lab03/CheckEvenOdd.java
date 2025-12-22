
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int Odd = 0;
        int Even = 0;
        while (true) { 
            Scanner sc = new Scanner(System.in);
            int numInput = sc.nextInt();
            if (numInput == -1) {
                System.out.printf("Odd number = %d and Even number = %d\n", Odd, Even);
                break;
            } else {
                if (numInput % 2 == 0) {
                    Even += 1;
                } else {
                    Odd += 1;
                }
            }
        }
    }
}
