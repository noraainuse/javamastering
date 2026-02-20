import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {

    public CalculatorOneGUI() {

        JFrame MyJFrame = new JFrame("Calculator");
        MyJFrame.setLayout(new GridLayout(4,1,5,5));

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(new JButton("Add"));
        buttonPanel.add(new JButton("Sub"));
        buttonPanel.add(new JButton("Multi"));
        buttonPanel.add(new JButton("Div"));

        // เรียงตามรูปจริง
        MyJFrame.add(t1);
        MyJFrame.add(t2);
        MyJFrame.add(buttonPanel);
        MyJFrame.add(result);

        MyJFrame.setSize(400, 180);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setVisible(true);
    }
}