import javax.swing.*;
import java.awt.*;

public class tempConvert{
    

    public tempConvert(){
    }

    public static double CtoF(double t){
	return t * 9/5 + 32 ;
    }

    public static double FtoC(double t){
	return (t - 32) * 5/9;
    }

    public static void main(String[] args){
	System.out.println(FtoC(32));
    }
}
