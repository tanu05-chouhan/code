import java.awt.event.*;
import java.awt.*;
class House1 extends Frame{
House1()
	{
		setVisible(true);
		setSize(600,600);
		setLocation(300,100);
		setTitle("House");
		setBackground(Color.pink);
	    addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			});
	}
	public void paint(Graphics g)
	{
	g.drawLine(200,40,60,100);
	g.drawLine(200,40,300,100);
	g.drawLine(60,100,300,100);
	
	
	g.drawLine(60,100,60,300);
	g.drawLine(300,100,300,300);
	g.drawLine(60,300,300,300);
	
	
	g.drawRect(100,140,150,160);
        g.drawRect(300,100,250,200);

        g.drawLine(200,40,450,40);
        g.drawLine(450,40,550,100);

        g.drawRect(350,140,150,80);
	}
	public static void main(String[] args) {
		House1 h=new House1();
	}
}
