import java.awt.*;
import java.awt.event.*;
class smiley extends Frame 
{
smiley()
{
        setVisible(true);
		setSize(600,600);
		setLocation(300,100);
		setTitle("Smiley");
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
public void paint(Graphics g)
{
	//face
	g.setColor(Color.yellow);
	g.fillOval(50,50,200,200);
    g.setColor(Color.black);
    //eye
    g.fillOval(100,100,15,15);
    g.drawOval(100,100,15,15);
    //eye
    g.fillOval(180,100,15,15);
    g.drawOval(180,100,15,15);
    //nose
    g.drawLine(150,135,150,155);
    g.setColor(Color.black);
    //smile
    g.fillArc(110,140,75,50,0,-175);
    g.fillArc(110,140,75,50,0,-175);
}
public static void main(String args[])
{
smiley s=new smiley();
}
}