
import java.awt.*;
	import java.awt.event.*;
	class checkbox extends Frame
	{
	checkbox()
	{
        setTitle("Checkbox");
	setLayout(null);
	setSize(800,800);
	setVisible(true);
        Font f=new Font("Chillar",Font.BOLD,12);
        setFont(f);
	Checkbox c1= new Checkbox("Hindi",false);
	add(c1);
	c1.setBounds(100,100,50,50);
	Checkbox c2 =new Checkbox("English",false);
	c2.setBounds(100,150,80,50);
	add(c2);
	Checkbox c3 =new Checkbox("Both",false);
	c3.setBounds(100,200,50,50);
	add(c3);
	Checkbox c4 =new Checkbox("None",false);
	c4.setBounds(100,250,50,50);
	add(c4);
	addWindowListener(new WindowAdapter() 
	{
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);
	}
	}
	);
	}
	public void paint(Graphics g)
	{
	g.setColor(Color.red);
	g.drawString("Q.Which language do you know the best?",50,50);
	}
	
	public static void main(String []args)
	{
         checkbox m1=new checkbox();
	
	}
	
	}