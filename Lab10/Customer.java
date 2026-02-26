public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    // start of constructor
    public Customer() {
        this("", "");
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    // end of constructor


    // start of setter-getter
    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    public Account getAccount(int index) {
        return this.acct[index];
    }
    public int getNumOfAccount() {
        return numOfAccount;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    // end of setter-getter
    
    @Override
    public String toString() {
        return String.format("Mr./Ms. %s %s has %d account",
        this.getFirstName(), this.getLastName(), this.getNumOfAccount());
    }
}
