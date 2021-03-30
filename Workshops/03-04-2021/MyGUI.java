import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGUI {

    public static void main(String[] args)
    {
        new AppFrame("Counter").init();
    }

}

class AppFrame extends JFrame {

    private static final long serialVersionUID = 8939657816316284649L;

    private JButton btn_reset;
    private Counter counter;
    private JLabel label_counter;
    private JPanel panel_btn;

    public AppFrame(String title)
    {
        super(title);

        //Counter
        this.counter = new Counter();
        
        // Layout
        GridLayout grid = new GridLayout(3, 1);
        grid.setVgap(5);
        this.getContentPane().setLayout(grid);

        // Button
        this.btn_reset = new JButton("Reset");
        this.btn_reset.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e)
            {
                counter.reset();
                label_counter.setText( "" + counter.getValue() );
            }

        });
        this.add(this.btn_reset);

        // Label
        this.label_counter = new JLabel();
        this.label_counter.setText( "" + counter.getValue() );
        this.label_counter.setFont( label_counter.getFont().deriveFont(32.0f) );
        this.label_counter.setHorizontalAlignment( SwingConstants.CENTER );
        this.add(this.label_counter);

        // Panel
        this.panel_btn = new JPanel();
        GridLayout layout = new GridLayout();

        int[] values = new int[]{ 1, 2, 3, -4, -9 };
        // set grid row-column
        layout.setRows(1);
        layout.setColumns(values.length);
        layout.setHgap(3);

        this.panel_btn.setLayout(layout);
        for(int i : values)
        {
            String text = i >= 0 ? ("+" + i) : ("" + i);
            JButton btn = new JButton(text);
            btn.addActionListener(new AdditionAction(i));
            this.panel_btn.add(btn);
        }
        this.add(this.panel_btn);
    }

    public AppFrame init()
    {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        return this;
    }

    class AdditionAction implements ActionListener {

        private int num;

        public AdditionAction(int num)
        {
            this.num = num;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            counter.add(num);
            label_counter.setText( "" + counter.getValue() );
        }

    }

}
