import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class MyJTable{
	public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("My JTabble");
	frame.setBounds(100,100,1000,500);
    
		String[][] data={
			{"001","Tanu","19"},
			{"002","Harsh","20"},
			{"003","Priyal","21"},
			{"004","Sonali","18"}
		};
		//Container c=frame.getContentPane();
		 //c.setLayout(null);
		String[] columnNames={"Roll No","Name","Age"};
		JTable table=new JTable(data,columnNames);
		table.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(table);
		frame.add(sp);
        frame.setVisible(true);
	
	}
}