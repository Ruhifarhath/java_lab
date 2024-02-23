import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI extends JFrame implements ActionListener {

    private JTextField number1Field, number2Field;
    private JButton divideButton;
    private JLabel resultLabel;

    public IntegerDivisionUI() {
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        number1Field = new JTextField(10);
        number2Field = new JTextField(10);
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        resultLabel = new JLabel();

        // Layout components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(new JLabel("Number 1:"));
        panel.add(number1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(number2Field);
        panel.add(divideButton);
        panel.add(resultLabel);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == divideButton) {
            try {
                int num1 = Integer.parseInt(number1Field.getText());
                int num2 = Integer.parseInt(number2Field.getText());

                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }

                int result = num1 / num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Please enter valid integers.");
            } catch (ArithmeticException ex) {
                resultLabel.setText("Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new IntegerDivisionUI();
            }
        });
    }
}
