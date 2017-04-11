public class Point{
  private double xCoordinate,yCoordinate;
  
  public Point(double x,double y){
    xCoordinate = x;
    yCoordinate = y;
  }   
  public double getX(){
    return xCoordinate;
  }
  public double getY(){
    return yCoordinate;
  }
  public String toString(){
  
    return ("("+xCoordinate+","+yCoordinate+")");
  }


} 
