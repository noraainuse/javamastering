public class Account {
    //attribute
    protected double balance;
    protected String name;

    //constructor
    public Account(double balance, String name) {
        this.setBalance(balance);
        this.setName(name);
    }

    //normal method
    public void deposit(double a) {
        if (a > 0) {
            this.setBalance(this.getBalance() + a);
            System.out.printf("%.1f baht is deposited to %s.\n", a, this.getName());
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a) {
        if (a > 0 && ((this.getBalance() - a) > 0)) {
            this.setBalance(this.getBalance() - a);
            System.out.printf("%.1f baht is withdrawn from %s.\n", a, this.getName());
        }
        else if (a <= 0) {
            System.out.println("Input number must be a positive integer.");
        }
        else if (this.getBalance() - a < 0) {
            System.out.println("Not enough money!");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void showAccount() {
        System.out.printf("%s account has %.1f baht.\n", this.getName(), this.getBalance());
    }
}
 