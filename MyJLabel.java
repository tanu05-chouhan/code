import javax.swing.*;
import java.awt.*;
class MyJLabel{
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("My JFrame");
		f.setBounds(100,100,1000,500);
	    Container c=f.getContentPane();
        c.setLayout(null);

        JLabel l=new JLabel("Username"); 
        l.setBounds(100,50,200,30);

        Font font=new Font("Arial",Font.ITALIC,10);
        l.setFont(font);
        c.add(l);
      
        ImageIcon icon=new ImageIcon("SS.jfif");
        //JLabel l1=new JLabel(icon);
        //l1.setBounds(400,50,icon.getIconWidth(),icon.getIconHeight());
        JLabel l1=new JLabel("Text",icon,JLabel.CENTER);
        l1.setBounds(0,100,500,100);
        c.add(l1);
}
}