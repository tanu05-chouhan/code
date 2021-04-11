import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJToggleButton extends JFrame implements ActionListener{
   private JToggleButton toggle;
   private Container c;
   private Color defaultColor;

  MyJToggleButton(){
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setTitle("My JToggleButton");
  setBounds(100,100,1000,500);
  c=getContentPane();
  c.setLayout(null);
  defaultColor=c.getBackground();

 toggle=new JToggleButton();
  toggle.setBounds(200,200,100,50);
  c.add(toggle);
  toggle.addActionListener(this);

 setVisible(true);
  }
   public static void main(String[] args) {
   new MyJToggleButton();
	}
  public void actionPerformed(ActionEvent e){
    if(toggle.isSelected()){
      //ON state
      c.setBackground(Color.YELLOW);
      toggle.setText("ON");
    }else{
      //OFF state 
      c.setBackground(defaultColor);
      toggle.setText("OFF");
    }
  }
}