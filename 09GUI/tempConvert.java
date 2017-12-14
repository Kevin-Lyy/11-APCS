import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class tempConvert extends JFrame implements ActionListener{
    private Container pane;
    private JButton c,f;
    private JTextField t;
   
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	System.out.println(s);
	if(s.equals("convert to celsius")){
		t.setText(String.valueOf(FtoC(Double.parseDouble(t.getText()))));
	}
	else if(s.equals("convert to fahrenheit")){
		t.setText(String.valueOf(CtoF(Double.parseDouble(t.getText()))));
	}
    }
		

    public tempConvert(){
	this.setTitle("Temperature converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	c = new JButton("convert to celsius");
	f = new JButton("convert to fahrenheit");
	t = new JTextField(5);

	c.addActionListener(this);
	f.addActionListener(this);
	t.addActionListener(this);
	
	pane.add(t);
	pane.add(c);
	pane.add(f);
    }

    public static double CtoF(double t){
	return t *(9/5) + 32 ;
    }

    public static double FtoC(double t){
	return (t - 32) * 5/9;
    }



    public static void main(String[] args){
	tempConvert g = new tempConvert();
	g.setVisible(true);
    }
}
