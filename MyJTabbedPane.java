import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJTabbedPane{
	public static void main(String[] args) {
    JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JTabbedPane");
	frame.setBounds(100,100,1000,500);
	Container c=frame.getContentPane();
  c.setLayout(null);
  
  JTabbedPane tp=new JTabbedPane();
  tp.setBounds(50,50,250,200);

  JPanel panel1=new JPanel();
  JPanel panel2=new JPanel();
  JPanel panel3=new JPanel();
  panel1.add(new JLabel("This is my first page"));
  panel2.add(new JLabel("This is my second page"));
  panel3.add(new JLabel("This is my third page"));
  tp.add("First",panel1);
  tp.add("Second",panel2);
  tp.add("Third",panel3);
  c.add(tp);
    
  frame.setVisible(true);
	}
}