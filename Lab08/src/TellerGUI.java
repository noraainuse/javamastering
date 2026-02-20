import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    public TellerGUI() {
        JFrame MainFrame = new JFrame("Teller GUI");
        MainFrame.setLayout(new GridLayout(4, 1));
        
        JLabel BlText = new JLabel("   Balance");
        JTextField BlField = new JTextField("6000");
        BlField.setEditable(false);
        JPanel Balance = new JPanel(new GridLayout(1, 2));
        Balance.add(BlText);
        Balance.add(BlField);
        
        JLabel AmLabel = new JLabel("   Amount");
        JTextField AmField = new JTextField();
        BlField.setEditable(true);
        JPanel Amount = new JPanel(new GridLayout(1, 2));
        Amount.add(AmLabel);
        Amount.add(AmField);
        
        JPanel Action = new JPanel();
        JButton DepositBT = new JButton("Deposit");
        JButton WithdrawBT = new JButton("Withdraw");
        JButton ExitBT = new JButton("Exit");
        Action.add(DepositBT);
        Action.add(WithdrawBT);
        Action.add(ExitBT);
        
        
        
        MainFrame.add(Balance);
        MainFrame.add(Amount);
        MainFrame.add(Action);
        MainFrame.setSize(275, 190);
        MainFrame.setVisible(true);
    }
}
