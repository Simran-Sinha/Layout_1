import javax.swing.*;
import java.awt.*;
public class Layout2  extends JFrame
{
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JPanel p4 = new JPanel();
JPanel p5 = new JPanel();
JPanel pp = new JPanel();
Layout2()
{
BorderLayout blayout = new BorderLayout(30,30);
pp.setLayout(blayout);
setVisible(true);
setSize(600,600);
add(pp);
pp.add(p1,"East");pp.add(p2,"West");pp.add(p3,"North");pp.add(p4,"South");pp.add(p5);
pp.setBackground( Color.YELLOW);
p1.setBackground( Color.BLUE);
p2.setBackground( Color.RED);
p3.setBackground( Color.BLACK);
p4.setBackground( Color.GREEN);
p5.setBackground( Color.PINK);
p1.setPreferredSize( new Dimension( 100,400));//(w,h)
p2.setPreferredSize( new Dimension( 100,400));
p3.setPreferredSize( new Dimension( 150,50));
p4.setPreferredSize( new Dimension( 150,50));
p5.setPreferredSize( new Dimension( 150,150));
}
public static void main(String []args)
{
new Layout2();
}
}



