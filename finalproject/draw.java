import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class draw extends JPanel {
    private ArrayList<Point> points;
    private JPanel mousepanel;
    char[][] fullboard;
    char[][] bigBoard;
    private int whoWon;
    
    //check winner 1-9,1-9
    public String checkWinner(int w1,int w2){
	//check for player 1
	if(//diagonal
	   (fullboard[w1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+2])== 1 ||
	   (fullboard[w1+2][w2]& fullboard[w1+1][w2+1]&
	    fullboard[w1][w2+2])== 1||
	   //vertical
	   (fullboard[w1][w2] & fullboard[w1][w2+1]&
	    fullboard[w1][w2+2])== 1 ||
	   (fullboard[w1+1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+1][w2+2])== 1 ||
	   (fullboard[w1+2][w2] & fullboard[w1+2][w2+1]&
	    fullboard[w1+2][w2+2])== 1 ||
	   //horizontal
	   (fullboard[w1][w2] & fullboard[w1+1][w2]&
	    fullboard[w1+2][w2])== 1 ||
	   (fullboard[w1][w2+1] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+1])== 1 ||
	   (fullboard[w1][w2+2] & fullboard[w1+1][w2+2]&
	    fullboard[w1+2][w2+2])== 1 ){
	    return "p1";
	}
	//check for player 2
	else
	if(//diagonal
	   (fullboard[w1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+2])== 2 ||
	   (fullboard[w1+2][w2]& fullboard[w1+1][w2+1]&
	    fullboard[w1][w2+2])== 2||
	   //vertical
	   (fullboard[w1][w2] & fullboard[w1][w2+1]&
	    fullboard[w1][w2+2])== 2 ||
	   (fullboard[w1+1][w2] & fullboard[w1+1][w2+1]&
	    fullboard[w1+1][w2+2])== 2 ||
	   (fullboard[w1+2][w2] & fullboard[w1+2][w2+1]&
	    fullboard[w1+2][w2+2])== 2 ||
	   //horizontal
	   (fullboard[w1][w2] & fullboard[w1+1][w2]&
	    fullboard[w1+2][w2])== 2 ||
	   (fullboard[w1][w2+1] & fullboard[w1+1][w2+1]&
	    fullboard[w1+2][w2+1])== 2 ||
	   (fullboard[w1][w2+2] & fullboard[w1+1][w2+2]&
	    fullboard[w1+2][w2+2])== 2 ){
	    return "p2";
	}
	return "p0";
    }
	
    //clear
    public void clearBoard(){
	for (int c = 0; c < 9; c++){
	    for (int i = 0;i < 9; i++){
		fullboard[c][i] = 0;
	    }
	}
    }
    /*
      public void paint(Graphics g){
	//board 1-3
	g.drawLine(0,900/9,900,900/9);
	g.drawLine(0,1800/9,900,1800/9);
	g.drawLine(900/9,0,900/9,900);
	g.drawLine(1800/9,0,1800/9,900);
	//board 4-6
	g.drawLine(0,3600/9,900,3600/9);
	g.drawLine(0,4500/9,900,4500/9);
	g.drawLine(3600/9,0,3600/9,900);
	g.drawLine(4500/9,0,4500/9,900);
	//board 7-9
	g.drawLine(0,6300/9,900,6300/9);
	g.drawLine(0,7200/9,900,7200/9);
	g.drawLine(6300/9,0,6300/9,900);
	g.drawLine(7200/9,0,7200/9,900);
	
	//large board
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(3));
	g.drawLine(0,900/3,900,900/3);
	g.drawLine(0,1800/3,900,1800/3);
	g.drawLine(300,0,300,900);
	g.drawLine(600,0,600,900);
	}

    */


  
    public draw(){
	
	fullboard = new char[9][9];
	for (int c = 0; c < 9; c++){
	    for (int i = 0;i < 9; i++){
		fullboard[c][i] = 0;
	    }
	}
	bigBoard = new char[9][9];
	for (int c = 0; c < 9; c++){
	    for (int i = 0;i < 9; i++){
		bigBoard[c][i] = 0;
	    }
	}
	
	points = new ArrayList<Point>();
	addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
		    int x = getX();
		    int y = getY();
		    int inbx = x/100;
		    int inby = y/100;
		    if (fullboard[inbx][inby] == 0){
			fullboard[inbx][inby] = 1;
			points.add(new Point(x,y));
			repaint();
		    }
		}
	    });
    }

    
       public void paintComponent(Graphics p){
       	super.paintComponent(p);
	Graphics2D p2 = (Graphics2D) p;
	p2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	p2.setColor(Color.blue);
	for (Point point : points){
	    p2.drawOval(point.x,point.y,100,100);
      	}
       }
	
       
    
    public static void main (String[] args){
	JFrame frame = new JFrame();
	frame.add(new draw());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(900,900);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setBackground(Color.white);
	frame.setLocation(0,0);
	frame.setTitle("Ultimate TicTacToe");
    }
      
    
}
