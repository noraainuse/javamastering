public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount() {
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.setCredit(credit);
    }
    public void setCredit(double credit) {
        if (credit >= 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit() {
        return credit;
    }
    @Override
    public void withdraw(double a) {
        if (a <= 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }

        double balance = this.getBalance();
        if (balance - a >= 0) {
            this.setBalance(balance - a);
            System.out.printf("%.1f baht is withdrawn from %s and your credit balance is %.1f.\n",
                    a, this.getName(), this.getCredit());
        }
        else if (balance + credit - a >= 0) {
            credit -= (a - balance);
            this.setBalance(0);
            System.out.printf("%.1f baht is withdrawn from %s and your credit balance is %.1f.\n",
                    a, this.getName(), this.getCredit());
        }
        else {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        double newA = Double.parseDouble(a);
        this.withdraw(newA);
    }
    @Override
    public String toString() {
        return String.format("The %s account has %.1f baht and %.1f credits.",
                super.getName(), super.getBalance(), this.getCredit());
    }
}
