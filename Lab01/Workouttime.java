
import java.util.Scanner;

/**
 *
 * @author lynn
 */
public class Workouttime {
    public static void main(String[] args) {
        Scanner tip = new Scanner(System.in);
        System.out.print("Enter your exercise time 1: ");
        int time1 = tip.nextInt();
        System.out.print("Enter your exercise time 2: ");
        int time2 = tip.nextInt();
        int timeAll = time1 + time2;
        int sec = timeAll % 60;
        int hour = timeAll / 60;
        int min = hour % 60;
        int hourfin = hour / 60;
        
        
        
        
        System.out.println("It is " + hourfin + " hours " + min + " minutes and " + sec + " seconds.");
    }
}
