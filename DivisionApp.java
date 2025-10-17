import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.TextField;

public class DivisionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel num1Label = new JLabel("Num1:");
        num1Label.setBounds(30, 30, 60, 25);
        frame.add(num1Label);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(100, 30, 150, 25);
        frame.add(num1Field);

        JLabel num2Label = new JLabel("Num2:");
        num2Label.setBounds(30, 70, 60, 25);
        frame.add(num2Label);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(100, 70, 150, 25);
        frame.add(num2Field);

        JTextField resultField = new JTextField();
        resultField.setBounds(100, 110, 150, 25);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(100, 140, 100, 25);
        frame.add(divideButton);

        divideButton.addActionListener(e -> {
            try {
                double num1 = Double.valueOf(num1Field.getText());
                double num2 = Double.valueOf(num2Field.getText());
                double result = num1 / num2;
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid integers!");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        });

        frame.setVisible(true);
    }
}


