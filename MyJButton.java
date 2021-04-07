import javax.swing.*;
import java.awt.*;
class MyJButton{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("My JButton");
		f.setBounds(100,100,1000,500);
	    Container c=f.getContentPane();
        c.setLayout(null);
     
       JButton btn=new JButton("Click me");
       btn.setBounds(100,100,200,40);
       c.add(btn);

       Font font=new Font("Arial",Font.PLAIN,30);
       btn.setFont(font);
       //btn.setText("Mybutton");
       Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
       btn.setCursor(cur);
}
}