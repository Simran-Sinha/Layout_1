import java.awt.*;
import javax.swing.*;
public class LayoutDemo3 extends JFrame
{
	JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JButton p4=new JButton("Click");
	
	JPanel ppanel=new JPanel();
	LayoutDemo3()
	{
		add(ppanel);
			ppanel.setLayout(null);
			ppanel.setBackground(Color.gray);
				p.setBounds(50,50,100,100);
				p.setBackground(Color.yellow);
				ppanel.add(p);
				p1.setBounds(50,350,100,100);
				p1.setBackground(Color.red);
				ppanel.add(p1);
				p2.setBounds(350,50,100,100);
				p2.setBackground(Color.green);
				ppanel.add(p2);
				p3.setBounds(350,350,100,100);
				p3.setBackground(Color.blue);
				ppanel.add(p3);
				p4.setBounds(150,150,200,200);
				p4.setBackground(Color.pink);
				ppanel.add(p4);
				
				//p4.setBorder(BorderFactory.createLineBorder(Color.black,4));
				p4.setBorder(BorderFactory.createTitledBorder("MyPanel"));
				
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new LayoutDemo3();
	}
}