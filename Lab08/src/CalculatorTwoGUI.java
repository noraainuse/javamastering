
import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    public CalculatorTwoGUI() {
        JFrame MyJFrame = new JFrame("My Calculator");
        MyJFrame.setLayout(new BorderLayout());
        
        JTextField NumberUI = new JTextField();
        MyJFrame.add(NumberUI, BorderLayout.NORTH);
        
        JPanel NumPadPanel = new JPanel(new GridLayout(4, 4));
        NumPadPanel.add(new JButton("7"));
        NumPadPanel.add(new JButton("8"));
        NumPadPanel.add(new JButton("9"));
        NumPadPanel.add(new JButton("+"));
        NumPadPanel.add(new JButton("4"));
        NumPadPanel.add(new JButton("5"));
        NumPadPanel.add(new JButton("6"));
        NumPadPanel.add(new JButton("-"));
        NumPadPanel.add(new JButton("1"));
        NumPadPanel.add(new JButton("2"));
        NumPadPanel.add(new JButton("3"));
        NumPadPanel.add(new JButton("x"));
        NumPadPanel.add(new JButton("0"));
        NumPadPanel.add(new JButton("c"));
        NumPadPanel.add(new JButton("="));
        NumPadPanel.add(new JButton("/"));
        
        MyJFrame.add(NumPadPanel);
        
        MyJFrame.setSize(300, 270);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setVisible(true);
    }
}
