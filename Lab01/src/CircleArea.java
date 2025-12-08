
import java.util.Scanner;

/**
 *
 * @author lynn
 */
public class CircleArea {
    public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("radius? : ");
        double radius = input.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("normal : " + area);
        System.out.println("negative radius : " + -area);
    }
}
