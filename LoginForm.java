import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
	Container c;
	JLabel l1,l2;
	JTextField user;
	JPasswordField pass;
	JButton btn;

MyFrame(){
	
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Login Form");
	setBounds(100,100,1000,500);

	c=getContentPane();
	c.setLayout(null);
	l1=new JLabel("Username");
	l2=new JLabel("Password");
	l1.setBounds(20,50,100,20);
	l2.setBounds(20,100,100,20);
	c.add(l1);
	c.add(l2);

	user=new JTextField();
	user.setBounds(130,50,120,20);
	c.add(user);

	pass=new JPasswordField();
	pass.setBounds(130,100,120,20);
	c.add(pass);

	btn=new JButton("Login");
	btn.setBounds(60,150,70,20);
	c.add(btn);
	btn.addActionListener(this);

	setVisible(true);
}
 public void actionPerformed(ActionEvent e){
 	System.out.println("Username"+user.getText());
 	System.out.println("Password"+pass.getText());
 }
}
class LoginForm{
	public static void main(String[] args) {
   MyFrame frame=new MyFrame();
	}
}