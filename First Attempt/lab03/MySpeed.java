import java.math.*;
import java.util.*;
import javax.swing.*;

public class MySpeed{
  public static void main(String [] args){
 double g = 9.8; //acceleration
   double d = 634; // distance
   
   double answer = Math.sqrt(2*g*d);//calculation of velocity
   //display velocity in a message box
   JOptionPane.showMessageDialog(null, "The speed is: " + String.format("%.2f",answer) + "m/s");
  
  }
}