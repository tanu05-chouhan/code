import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJColorChooser{
	public static void main(String[] args) {
    JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JColorChooser");
	frame.setBounds(100,100,1000,500);
  frame.setVisible(true);

	final Container c=frame.getContentPane();
  c.setLayout(new GridLayout());
  
  JButton btn=new JButton("Change Color");
  c.add(btn);
  btn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      Color color=JColorChooser.showDialog(null,"Select a Color",Color.black);
      c.setBackground(color);
    }
  });
 
  frame.revalidate();
	}
}