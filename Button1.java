import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
class Button1 extends Frame implements ActionListener
{
	Frame f;
	TextField tf;
	Button b1,b2;
	Button1()
	{
		f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		f.setVisible(true);
		b1=new Button("display");
		b1.setBounds(100,100,75,45);
		b2=new Button("delete");
		b2.setBounds(100,150,75,45);
		tf=new TextField(10);
		f.add(b1);
		f.add(b2);
		f.add(tf);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		tf.setText(str);
	}
	public static void main(String[] args)
	{
		Button1 e=new Button1();
	}
}