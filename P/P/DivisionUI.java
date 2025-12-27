package P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionUI extends JFrame {
    JTextField num1, num2, result;
    JButton divide;

    DivisionUI() {
        setLayout(new GridLayout(4,2));
        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        divide = new JButton("Divide");
        add(new JLabel("Num1:")); add(num1);
        add(new JLabel("Num2:")); add(num2);
        add(new JLabel("Result:")); add(result);
        add(divide);
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(num1.getText());
                    int b = Integer.parseInt(num2.getText());
                    int res = a / b;
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Enter integers only");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null,"Division by zero not allowed");
                }
            }
        });
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DivisionUI();
    }
}