import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener{
    private JFrame MyJFrame;
    private JTextField NumberUI;

    private double num1 = 0;
    private String operator = "";
    public CalculatorSample() {
        MyJFrame = new JFrame("My Calculator");
        MyJFrame.setLayout(new BorderLayout());
        
        NumberUI = new JTextField();
        MyJFrame.add(NumberUI, BorderLayout.NORTH);
        
        JPanel NumPadPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","x",
            "0","c","=","/"
        };

        for(String text : buttons){
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            NumPadPanel.add(btn);
        }
        
        MyJFrame.add(NumPadPanel);
        
        MyJFrame.setSize(300, 270);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setVisible(true);
    }
    @Override
      public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();
        
        if(cmd.matches("[0-9]")){
            NumberUI.setText(NumberUI.getText() + cmd);
        }
        
        else if(cmd.matches("[+\\-x/]")){
            num1 = Double.parseDouble(NumberUI.getText());
            operator = cmd;
            NumberUI.setText("");
        }

        else if(cmd.equals("=")){
            double num2 = Double.parseDouble(NumberUI.getText());
            double result = 0;

            switch(operator){
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "x": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            NumberUI.setText(String.valueOf(result));
        }

        // ถ้ากด c
        else if(cmd.equals("c")){
            NumberUI.setText("");
            num1 = 0;
            operator = "";
        }
    }
}

