import java.math.*;
import java.util.*;
import javax.swing.*;

public class ComputeArea
{
  public static void main(String[] args){
    Scanner info = new Scanner(System.in);
    
//request length from user
    System.out.println("Length:");
    
//store int in terminal
    int l = info.nextInt();
    
//request length from user
    System.out.println("Breadth:");
    
//store int in terminal
    int b = info.nextInt();
    
//request length from user
    System.out.println("Height:");
    
//store int in terminal
    int h = info.nextInt();
    
//calculate volume
    int answer = l*b*h;
 
    System.out.println(answer);
  }
}