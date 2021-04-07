import javax.swing.*;
import java.awt.*;
class MyJLabel{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("My JFrame");
		f.setBounds(100,100,700,500);
	    Container c=f.getContentPane();
        c.setLayout(null);

        JLabel l=new JLabel("Username");
        l.setBounds(100,50,200,30);

        Font f=new Font("Arial",Font.ITALIC,30);
        L.setFont(f);
        c.add(l);
       
	}
}