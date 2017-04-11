public class LineSegment{
  private Point start;
  private Point end;
  public double scalar;

  public LineSegment(Point point1, Point point2){
   start=point1;
   end=point2;
  }
  
  
  public Point getStart(){
  return start;
     
  }
 
  public Point getEnd(){
  return end;
  }
 
  public double computeSlope(){
    return (getEnd().getX()-getStart().getX())/(getEnd().getY()-getStart().getY());
  }

  public double length(){
  return((getEnd().getX()-getStart().getX())*(getEnd().getX()-getStart().getX()))-((getEnd().getY()-getStart().getY())*(getEnd().getY()-getStart().getY()));
  }
  
  public double computeYintercept(){
   return (start.getY()-(computeSlope()*start.getX()));
  }
  public String toString(){
  return ("y="+computeSlope()+"x+"+computeYintercept());
  }
  
  public double scaleByFactor(double scalar){
    return length()*scalar;
  }

}
