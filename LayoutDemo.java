import java.awt.*;
import javax.swing.*;
public class LayoutDemo extends JFrame
{
	JPanel main_panel = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();

	LayoutDemo()
	{
		setLayout(null);
		add(main_panel);
		main_panel.setLayout(null);
		main_panel.setBounds(0,0,800,650);
		main_panel.add(p2);
		main_panel.add(p3);
		main_panel.add(p4);
		main_panel.add(p5);
		main_panel.add(p6);
		p2.setBounds(0,0,800,100);
		p3.setBounds(0,100,100,400);
		p4.setBounds(680,100,100,400);
		p5.setBounds(0,500,800,100);
		main_panel.setBackground(Color.WHITE);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		p4.setBackground(Color.RED);
		p5.setBackground(Color.YELLOW);
		setSize(800,650);
		setVisible(true);

	}

	public static void main(String [] args)
	{
	new LayoutDemo();
	}

}
	