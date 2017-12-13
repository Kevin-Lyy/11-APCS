import javax.swing.*;
import java.awt.*;

public class tempConvert extends JFrame{
    private Container pane;
    private JButton c;
    private JButton f;
    private JTextField t;

    public tempConvert(){
	this.setTitle("Temperature converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	c = new JButton("convert to celsius");
	f = new JButton("convert to fahrenheit");
	t = new JTextField(12);
	pane.add(t);
	pane.add(c);
	pane.add(f);
    }

    public static double CtoF(double t){
	return t * 9/5 + 32 ;
    }

    public static double FtoC(double t){
	return (t - 32) * 5/9;
    }

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand;
	/*
	  if(button for f  pressed && get inside textbox is a number)
	  convert to f
	  else (button for c && get inside textbox is a number
	  convert to c
	  return you done messed up
	 */
    }

    public static void main(String[] args){
	tempConvert g = new tempConvert();
	g.setVisible(true);
    }
}
