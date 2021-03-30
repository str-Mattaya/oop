import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThreadAltFrame extends JFrame {
	
	private static final long serialVersionUID = -8669172807559427911L;
	
	private JLabel label;
	private JButton btn;
	private Counter counter;
	
	public ThreadAltFrame()
	{
		super("Threads");
		this.getContentPane().setLayout(new BorderLayout());

		this.counter = new Counter();

		this.label = new JLabel();
		this.label.setText("" + counter.getValue());
		this.label.setFont( label.getFont().deriveFont(32.0f) );
        this.label.setHorizontalAlignment( SwingConstants.CENTER );
        this.label.setVerticalAlignment(SwingConstants.CENTER);
		this.add(this.label, BorderLayout.CENTER);
		
		this.btn = new JButton();
		this.btn.setText("Calculate");
		this.btn.addActionListener(new AdditionAction());
		this.add(this.btn, BorderLayout.PAGE_END);
	}
	
	public ThreadAltFrame init()
	{
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		return this;
	}
	
	class AdditionAction implements ActionListener {

        public AdditionAction(){}

        @Override
        public void actionPerformed(ActionEvent e)
        {
			counter.reset();
            for(int i = 1; i <= 500; i++)
			{
				MyThread t = new MyThread(i);
				t.start();
			}
        }

    }

	class MyThread extends Thread{

		private int num;

		public MyThread(int num)
		{
			this.num = num;
		}

		@Override
		public void run()
		{
			try {
				counter.increase(num);
				Thread.sleep(10);
				label.setText("" + counter.getValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class GuiThread_02 {
	public static void main(String[] args)
	{
		new ThreadAltFrame().init();
	}
}