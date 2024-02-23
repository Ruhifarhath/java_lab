import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JButton computeButton;

    public FactorialApplet() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel inputLabel = new JLabel("Enter an integer:");
        inputField = new JTextField(10);

        JLabel outputLabel = new JLabel("Factorial:");
        outputField = new JTextField(10);
        outputField.setEditable(false); // Make output field read-only

        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(outputLabel);
        panel.add(outputField);
        panel.add(computeButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeButton) {
            try {
                int num = Integer.parseInt(inputField.getText());
                long factorial = computeFactorial(num);
                outputField.setText(Long.toString(factorial));
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input");
            }
        }
    }

    private long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FactorialApplet();
            }
        });
    }
}
