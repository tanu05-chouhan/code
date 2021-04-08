import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener{
	Container c;
	JButton btn;
	Myframe(){
		c=this.getContentPane();
		c.setLayout(null);
		btn=new JButton("Click me");
		btn.setBounds(100,100,100,50);
		c.add(btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		c.setBackground(Color.YELLOW);
	}
}
class BtnEvent{
	public static void main(String[] args) {
		Myframe f=new Myframe();
		f.setTitle("Button Event");
		f.setBounds(100,100,1000,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}