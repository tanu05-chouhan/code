import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
	Container c;
	JLabel l1,l2,result;
	JTextField t1,t2;
	public JButton add,sub,mul,div;

MyFrame(){
	
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Login Form");
	setBounds(100,100,1000,500);

	c=getContentPane();
	c.setLayout(null);
	l1=new JLabel("First Number");
	l2=new JLabel("Second Number");
	l1.setBounds(20,50,100,20);
	l2.setBounds(20,100,100,20);
	c.add(l1);
	c.add(l2);

	t1=new JTextField();
	t1.setBounds(130,50,120,20);
	c.add(t1);
	t2=new JTextField();
	t2.setBounds(130,100,120,20);
	c.add(t2);

	add=new JButton("+");
	add.setBounds(20,150,70,20);
	c.add(add);
	sub=new JButton("-");
	sub.setBounds(100,150,70,20);
	c.add(sub);
	mul=new JButton("x");
	mul.setBounds(180,150,70,20);
	c.add(mul);
	div=new JButton("/");
	div.setBounds(260,150,70,20);
	c.add(div);
	result=new JLabel("Result:-");
	result.setBounds(20,180,150,20);
    c.add(result);

    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);

	setVisible(true);
}
  
 public void actionPerformed(ActionEvent n){
 	try{
 	if(n.getSource()==add){
 		int a= Integer.parseInt(t1.getText());
 		int b= Integer.parseInt(t2.getText());
 		int c=a+b;
 		result.setText("Result:"+c);
 	}
 	if(n.getSource() ==sub){
 		int a= Integer.parseInt(t1.getText());
 		int b= Integer.parseInt(t2.getText());
 		int c=a-b;
 		result.setText("Result:"+c);
 	}
 	if(n.getSource() ==mul){
 		int a= Integer.parseInt(t1.getText());
 		int b= Integer.parseInt(t2.getText());
 		int c=a*b;
 		result.setText("Result:"+c);
 	}
 	if(n.getSource()==div){
 		int a= Integer.parseInt(t1.getText());
 		int b= Integer.parseInt(t2.getText());
 		int c=a/b;
 		result.setText("Result:"+c);
 	}
 }catch(NumberFormatException e){
 	result.setText("input integer values only");
 }catch(ArithmeticException e1){
 	result.setText("cannot divide by zero");
 }
}
}
class Calculator{
	public static void main(String[] args) {
   MyFrame frame=new MyFrame();
	}
}