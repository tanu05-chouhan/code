import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJCheckbox{
	public static void main(String[] args) {
    JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JCheckBox");
	frame.setBounds(100,100,1000,500);
	Container c=frame.getContentPane();
  c.setLayout(null);
 
   JCheckBox c1=new JCheckBox("High School");
   JCheckBox c2=new JCheckBox("Intermediate");
   JCheckBox c3=new JCheckBox("Graduation");
   JCheckBox c4=new JCheckBox("Post-Graduation");

   c1.setBounds(100,50,150,20);
   c2.setBounds(100,100,150,20);
   c3.setBounds(100,150,150,20);
   c4.setBounds(100,200,150,20);

   c.add(c1);
   c.add(c2);
   c.add(c3);
   c.add(c4);
  
   c1.setSelected(true);
   Font font=new Font("Arial",Font.BOLD,15);
   c1.setFont(font);
   c2.setFont(font);
   c3.setFont(font);
   c4.setFont(font);

   frame.setVisible(true);
	}
}