package Lab04.q7;

public class Account {
    public double balance;
    public String name;
    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero");
        }
    }
    public double withdraw(double b) {
        if (b >= 0) {
            double checker = balance - b;
            if (checker < 0) {
                System.out.println("Your account balance is insufficient.");
                return 0;
            } else {
                balance -= b;
                return b;
                }
            } else {
                System.out.println("The balance variable must be greater than or equal to zero.");
                return 0;
        }
    }
    public void showInfo() {
        System.out.printf("In %s account, there is a balance equal to %.1f baht.\n", name, balance);
    }
}
