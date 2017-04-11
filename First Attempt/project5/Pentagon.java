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
public class Pentagon extends Shape {
 int center_x;
 int center_y;
 int radius;
 
 public Pentagon(int center_x,int center_y,int radius){
  this.center_x = center_x;
  this.center_y = center_y;
  this.radius = radius;
 }

 @Override
 public void draw() {
  int x1 = center_x;
  int x2 = center_x+((int)((radius*Math.cos(0.314159265))));
  int x3 = center_x+((int)((radius*Math.cos(0.942477796))));
  int x4 = center_x-((int)((radius*Math.cos(0.942477796))));
  int x5 = center_x-((int)((radius*Math.cos(0.314159265))));
  int y1 = center_y-radius;
  int y2 = center_y-((int)((radius*Math.sin(0.314159265))));
  int y3 = center_y+((int)((radius*Math.sin(0.942477796)))); 
 
  drawLine(x1,y1,x2,y2);
  drawLine(x2,y2,x3,y3);
  drawLine(x3,y3,x4,y3);
  drawLine(x4,y3,x5,y2);
  drawLine(x5,y2,x1,y1);
 }
 
} 