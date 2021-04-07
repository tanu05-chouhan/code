import javax.swing.*;
import java.awt.*;
class MyJTextField{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("My JFrame");
		f.setBounds(100,100,1000,500);
	    Container c=f.getContentPane();
        c.setLayout(null);

        JTextField t1=new JTextField();
        t1.setBounds(100,50,250,30);
        c.add(t1);
        t1.setText("Tanu Chouhan");
        Font font=new Font("Arial",Font.BOLD,30);
        t1.setFont(font);
        t1.setBackground(Color.GREEN);
         t1.setForeground(Color.YELLOW);
         t1.setEditable(false);
}
}