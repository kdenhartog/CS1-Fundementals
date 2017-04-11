/**
 * Painter
 * this program allows you to create shapes in a GUI
 *
 * @Kyle Den Hartog
 *
 * @RMB Daskin, Anmer
 *
 * @10.29.12
 *
 */
public class Square extends Shape{
 int center_x;
 int center_y;
 int radius;
 
 public Square(int center_x,int center_y,int radius) {
  this.center_x = center_x;
  this.center_y = center_y;
  this.radius = radius;
 }
 
 public void draw(){
  int x1 = center_x-((int)((radius*Math.sin(0.785398163))));
  int x2 = center_x+((int)((radius*Math.sin(0.785398163))));
  int y1 = center_y-((int)((radius*Math.sin(0.785398163))));
  int y2 = center_y+((int)((radius*Math.sin(0.785398163))));
  
  drawLine(x1,y1,x1,y2);
  drawLine(x1,y2,x2,y2);
  drawLine(x2,y2,x2,y1);
  drawLine(x2,y1,x1,y1);
 }

}
