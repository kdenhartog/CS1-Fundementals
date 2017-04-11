import java.math.*;
import java.util.*;
import javax.swing.*;

public class DoubleMin
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    //gets first number
    System.out.println("first number:");
    //stores number in terminal
    double a = s.nextInt();
    //gets second number
    System.out.println("second number:");
    //stores second number in terminal
    double b = s.nextInt();
    //gets third number
    System.out.println("third number:");
    //stores third number in terminal
    double c = s.nextInt();
    //outputs the smallest of the 3 numbers
    System.out.println(Math.min(a,c));
  }
}
    