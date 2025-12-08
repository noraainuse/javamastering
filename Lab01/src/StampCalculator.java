/**
 *
 * @author lynn
 */
import java.util.Scanner;
public class StampCalculator {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Total Price : ");
        double price = numInput.nextDouble();
        double ugetStamp = price / 50;
        int truncatedNum = (int) ugetStamp;
        System.out.println("You got " + truncatedNum + " stamp(s)");
    }
}
