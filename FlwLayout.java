import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FlwLayout{
  JFrame frame;
FlwLayout() {
  frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Flow Layout");
	frame.setBounds(100,100,1000,500);
  
  Container c=frame.getContentPane();
  
  JButton btn1=new JButton("Button 1");
  JButton btn2=new JButton("Button 2");
  JButton btn3=new JButton("Button 3");
  JButton btn4=new JButton("Button 4");
  JButton btn5=new JButton("Button 5");
  c.add(btn1);
  c.add(btn2);
  c.add(btn3);
  c.add(btn4);
  c.add(btn5);

  FlowLayout f=new FlowLayout(FlowLayout.RIGHT);
  c.setLayout(f); 
  frame.setVisible(true);

	}
  public static void main(String[] args) {
   FlwLayout f1= new FlwLayout();
  }
}