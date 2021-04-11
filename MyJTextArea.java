import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJTextArea{
	public static void main(String[] args) {
    JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JTextArea");
	frame.setBounds(100,100,1000,500);
	Container c=frame.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.BLUE);
   
   JTextArea textArea=new JTextArea();
   textArea.setBounds(100,100,400,200);
   c.add(textArea);
   textArea.setText("This is my textArea");
   textArea.setFont(new Font("Arial",Font.BOLD,15));
   textArea.setLineWrap(true);

   
    frame.setVisible(true);
	}
}