import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Excellent = 0;
        int Good = 0;
        int Fair = 0;
        int Poor = 0;
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        for (int i = 1; i <= studentCount; i++) {
            System.out.printf("Enter score for student %d: ", i);
            int scoreInput = sc.nextInt();
            if (scoreInput >= 80) {
                System.out.println("Excellent");
                Excellent += 1;
            } else if (scoreInput >= 60) {
                System.out.println("Good");
                Good += 1;
            } else if (scoreInput >= 50) {
                System.out.println("Fair");
                Fair += 1;
            } else {
                System.out.println("Poor");
                Poor += 1;
            }
        }
        sc.close();
        System.out.printf("Summary:\nExcellent: %d\nGood: %d\nFair: %d\nPoor: %d\n", Excellent, Good, Fair, Poor);
    }
}
