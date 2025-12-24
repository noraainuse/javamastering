import java.util.Scanner;

public class newline_i_beam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int numInput = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numInput; i++) {
            if (i % 5 == 0) {
                System.out.print("|\n");
            } else {
                System.out.print("|");
            }
        }
    }
}
