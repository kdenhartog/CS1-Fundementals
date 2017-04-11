import java.util.*;


public class PlaneGeometry{
  public static void main(String args[]){
  Scanner info = new Scanner(System.in);
  
  
  System.out.println("what is the first x coordinate?");
  double x1 = info.nextDouble();
  System.out.println("what is the first y coordinate?");
  double y1 = info.nextDouble();
  System.out.println("what is the second x coordinate?");
  double x2 = info.nextDouble();
  System.out.println("what is the second y coordinate?");
  double y2 = info.nextDouble();
  System.out.println("what is the scalar multiple?");
  double scalar = info.nextDouble();
  
  Point one = new Point(x1,y1);
  Point two = new Point(x2,y2);
 
  LineSegment line = new LineSegment(one,two);
 
  System.out.println("slope:"+line.computeSlope());
  System.out.println("Length:"+line.length());
  System.out.println("Y Intercept:"+line.computeYintercept());
  System.out.println("Equation:"+line.toString());
  System.out.println("New Length:"+line.scaleByFactor(scalar));
 

  
  
  }
}
  
