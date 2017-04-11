import java.math.*;
import java.util.*;



public class MyVolume{
  public static void main(String[] args){
    //gives the radius of my ball
    double r = 1.5;
    //calculates the answer
      double answer = (4.0/3)*3.1415926*Math.pow(r,3);
  //displays answer
      System.out.println ("The answer is : " + String.format("%.3f",answer) + " meters cubed");
  }
}
