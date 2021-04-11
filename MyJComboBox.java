import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class MyJComboBox{
	 public static void main(String[] args) {
  JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JComboBox");
	frame.setBounds(100,100,1000,500);
	Container c=frame.getContentPane();
  c.setLayout(null);
  
  String[] values={"A","B","C","D"};

  JComboBox c1=new JComboBox(values);
  c1.setBounds(100,100,100,20);
  c.add(c1);

  JButton button=new JButton("OK");
  button.setBounds(300,200,70,40);
  c.add(button);

  c1.setEditable(true);
  JLabel label=new JLabel("");
  label.setBounds(100,300,100,30);
  c.add(label);

  button.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    String item=String.valueOf(c1.getSelectedItem());
    label.setText(item);
   }
  });
  frame.setVisible(true);
	}
}
