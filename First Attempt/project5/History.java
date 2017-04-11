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
import java.util.ArrayList;


public class History {
 
 ArrayList<Shape> myArr;
 ArrayList<Shape> redoArr;
 
 public History() {
  
   myArr = new ArrayList<Shape>();
   redoArr= new ArrayList<Shape>(myArr);
 }


 public void undo(){
  int size = myArr.size();
  if(myArr.size() == 0){
   
  }else{
  Shape tempShape = myArr.remove(size-1);
  redoArr.add(tempShape);
  } 
 }
 public void redo(){
  if(redoArr.size()== 0){
   
  }else{
  myArr.add(redoArr.get(redoArr.size()-1));
  }
 }
 public void clear(){
  myArr.clear();
 }
 public void add(Shape s){
  myArr.add(s);
  redoArr = new ArrayList<Shape>();
 }

 public Shape[] getShapes() {
  Shape[] listToArray = myArr.toArray(new Shape[myArr.size()]); 
  return listToArray;
 }
}
