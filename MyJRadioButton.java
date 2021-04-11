import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJRadioButton{
	public static void main(String[] args) {
    JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JRadioButton");
	frame.setBounds(100,100,1000,500);
	Container c=frame.getContentPane();
  c.setLayout(null);
   
   JRadioButton radio1=new JRadioButton("Male");
   radio1.setBounds(100,50,100,20);
   c.add(radio1);
   //radio1.setSelected(true);
   //radio1.setEnabled(false);
   JRadioButton radio2=new JRadioButton("Female");
   radio2.setBounds(200,50,100,20);
   c.add(radio2);

   ButtonGroup gender=new ButtonGroup();
   gender.add(radio1);
   gender.add(radio2);
   frame.setVisible(true);
	}
}