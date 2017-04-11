import java.math.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.text.*;


public class StringParser
{
  public static void main(String[] args){
    
    Scanner info = new Scanner(System.in);
    //request height from user
    String height = JOptionPane.showInputDialog(null, "Enter height:");
    //request radius from user
    String radius = JOptionPane.showInputDialog(null, "Enter radius:");
    //changes string of height into an integer
    int h = Integer.parseInt(height);
    //changes string of radius into an integer
    int r = Integer.parseInt(radius);
    //calculates 
    double answer = (Math.PI*Math.pow(r,2))*h;
  //outputs answer
  JOptionPane.showMessageDialog(null, "your answer is: " + String.format("%.2f",answer));
    
 
    
  }
}