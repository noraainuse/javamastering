
import java.util.ArrayList;

public class Customer2 {
    private String firstName;
    private String lastName;
    private int numOfAccount;
    private ArrayList<Account> acct;
    // start of constructor
    public Customer2() {
        this("", "");
    }
    public Customer2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    // end of constructor


    // start of setter-getter
    public void addAccount(Account acct) {
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public Account getAccount(int index) {
        return this.acct.get(index);
    }
    public int getNumOfAccount() {
        return this.acct.size();
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
