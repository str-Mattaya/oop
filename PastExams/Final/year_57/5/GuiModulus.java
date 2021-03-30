import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.*;

public class GuiModulus extends JFrame {

    private static final long serialVersionUID = 1L;

    public GuiModulus()
    {
        super("Modulus");

        // set GridLayout
        this.getContentPane().setLayout(new GridLayout(1, 7));

        // first number
        JLabel label1 = new JLabel("First Number");
        // format
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField textField1 = new JTextField("");
        this.add(label1);
        this.add(textField1);

        // second number
        JLabel label2 = new JLabel("Second Number");
        // format
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField textField2 = new JTextField("");
        this.add(label2);
        this.add(textField2);

        // result
        JLabel label3 = new JLabel("Result");
        // format
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField result = new JTextField("");
        result.setEditable(false);
        this.add(label3);
        this.add(result);

        // button
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new OnClickCalculate(textField1, textField2, result));
        this.add(btnCalculate);


        // init
        this.setSize(new Dimension(800, 80));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class OnClickCalculate implements ActionListener {

        JTextField txt1;
        JTextField txt2;
        JTextField result;

        public OnClickCalculate(JTextField text1, JTextField text2, JTextField result)
        {
            this.txt1 = text1;
            this.txt2 = text2;
            this.result = result;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                int a = Integer.parseInt(txt1.getText());
                int b = Integer.parseInt(txt2.getText());
                result.setText("" + (a%b));
            }
            catch(ArithmeticException aException)
            {
                txt2.setText("");
                result.setText("");
            }
            catch(NumberFormatException nException)
            {
                result.setText("");
            }
        }

    }
    
}
