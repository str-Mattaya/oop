import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GuiConverter extends JFrame {

    private JPanel inputPanel;
    private JLabel inputLabel;
    private JTextField input;
    private JButton btnCheck;
    private JTextArea result;
    private ArrayList<String> lines;

    public GuiConverter() {
        super("Converter");

        lines = new ArrayList<String>();
        // set Layout to BorderLayout
        // you can use GridLayout instead
        this.getContentPane().setLayout(new BorderLayout());

        // init JPanel
        inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        // init JTextField
        inputLabel = new JLabel("Distance in miles: ");
        input = new JTextField("");

        // init Button
        btnCheck = new JButton("Convert!");
        btnCheck.addActionListener(new onClickConvert());

        // init JLabel
        result = new JTextArea("");
        result.setEnabled(false);
        result.setDisabledTextColor(new Color(0, 0, 0));
        result.setPreferredSize(new Dimension(550, 330));

        // first group JTextField and JButton to JPanel
        inputPanel.add(inputLabel, BorderLayout.LINE_START);
        inputPanel.add(input, BorderLayout.CENTER);
        inputPanel.add(btnCheck, BorderLayout.LINE_END);
        inputPanel.setSize(new Dimension(600, 50));

        // then add JPanel and JLabel to JFrame
        this.add(inputPanel, BorderLayout.PAGE_START);
        this.add(result, BorderLayout.PAGE_END);

        // init JFrame
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    class onClickConvert implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                String strMiles = input.getText();
                double miles = Double.parseDouble(strMiles);
                double kilometers = 1.6 * miles;

                String oldText = result.getText();
                String newText = strMiles + " miles equals " + kilometers + " kilometers\n";
                result.setText(oldText + newText);
            }
            catch (NumberFormatException exception)
            {
                System.out.println("Input is not number.");
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }

        private void StylistAction()
        {
            try
            {
                String strMiles = input.getText();
                double kilometers = 1.6 * Double.parseDouble(strMiles);

                lines.add(strMiles + " miles equals " + kilometers + " kilometers");
                // max lines = 20
                while(lines.size() > 20)
                {
                    lines.remove(0);
                }

                String txt = "";
                for(String str : lines)
                {
                    txt += str + "\n";
                }
                result.setText(txt);
            }
            catch (NumberFormatException exception)
            {
                System.out.println("Input is not number.");
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }

}
