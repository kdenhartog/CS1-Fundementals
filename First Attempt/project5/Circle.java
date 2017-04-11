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
public class Circle extends Shape {
 int center_x;
 int center_y;
 int radius;

 public Circle(int center_x,int center_y,int radius){
  this.center_x = center_x;
  this.center_y = center_y;
  this.radius = radius;
 }

 public void draw(){
  drawEllipse(center_x,center_y,radius*2,radius*2);
 }
}