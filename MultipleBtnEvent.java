import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener{
	Container c;
	JButton btn1,btn2,btn3;
	Myframe(){
		c=this.getContentPane();
		c.setLayout(null);

       btn1=new JButton("RED");
       btn1.setBounds(100,100,100,50);
       c.add(btn1);
       btn2=new JButton("YELLOW");
       btn2.setBounds(250,100,100,50);
       c.add(btn2);
       btn3=new JButton("GREEN");
       btn3.setBounds(400,100,100,50);
       c.add(btn3);

       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==btn1){
        c.setBackground(Color.RED);
         }  
        if(e.getSource()==btn2){
        c.setBackground(Color.YELLOW);
         }  
       if(e.getSource()==btn3){
        c.setBackground(Color.GREEN);
         }  
	}
}
class MultipleBtnEvent{
	public static void main(String[] args) {
		Myframe f=new Myframe();
		f.setTitle("Button Event");
		f.setBounds(100,100,1000,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}