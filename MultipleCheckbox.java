import java.awt.*;
import java.awt.event.*;
class MultipleCheckbox extends Frame implements ItemListener
{   

	String msg="";
	Checkbox c1,c2,c3,c4,c5;
	public MultipleCheckbox()
	{
		setLayout(new FlowLayout());
		c1=new Checkbox("HTML",true);
		c2=new Checkbox("CSS");
		c3=new Checkbox("C");
		c4=new Checkbox("C++");
		c5=new Checkbox("Java");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		c1.addItemListener(this);
		c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g){
		msg="Current Language status:  ";
		g.drawString(msg,100,100);
		msg="HTML: "+c1.getState();
		g.drawString(msg,100,120);
		msg="CSS: "+c2.getState();
		g.drawString(msg,100,140);
		msg="C: "+c3.getState();
		g.drawString(msg,100,160);
		msg="C++: "+c4.getState();
		g.drawString(msg,100,180);
		msg="Java: "+c5.getState();
		g.drawString(msg,100,200);
	}
	
	public static void main(String[] args)
	{
		
		MultipleCheckbox ch=new MultipleCheckbox();
		ch.setVisible(true);
		ch.setSize(600,600);
		ch.setLocation(300,100);
		ch.setTitle("Multiple Checkbox");
		ch.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
	}
}