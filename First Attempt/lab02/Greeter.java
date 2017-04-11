import java.util.*;
import javax.swing.*;
/*this is a program that will intake the user's name and output it back to them*/

public class Greeter
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    
    String userName = JOptionPane.showInputDialog(null, "Enter your name:");
    
    JOptionPane.showMessageDialog(null, "Hello," + userName);
                                    }

}

                                    
    
    