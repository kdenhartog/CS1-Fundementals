//CS180 - Lab08: Inheritance and Interfaces Part 1

/**
 * This class represents a rectangular cuboid. A cuboid has a Box shape.
 * 
 * @see <a
 *      href="http://en.wikipedia.org/wiki/Cuboid#Rectangular_cuboid">http://en.wikipedia.org/wiki/Cuboid#Rectangular_cuboid</a>
 */
public class Cuboid {
 /**
  * The cuboid length.
  */
 private double length;

 /**
  * The cuboid width.
  */
 private double width;

 /**
  * The cuboid height.
  */
 private double height;

 /**
  * Constructor.
  * 
  * @param length
  * @param width
  * @param height
  */
 public Cuboid(double length, double width, double height) {
  // TODO: Fill here.
   this.length = length;
   this.width = width;
   this.height = height;
 }

 /**
  * Constructor overload.
  * 
  * @param baseLength
  * @param height
  */
 public Cuboid(double baselength, double height) {
  // TODO: Fill here.
   length = baselength;
   width = baselength;
   this.height = height;
 }

 /**
  * Getter.
  * 
  * @return the length.
  */
 public double getLength() {
  return length;
 }

 /**
  * Getter.
  * 
  * @return the width.
  */
 public double getWidth() {
  return width;
 }

 /**
  * Getter.
  * 
  * @return the height.
  */
 public double getHeight() {
  return height;
 }

 /**
  * Computes the area of the Square.
  * 
  * @return computed area.
  */
 public double computeSurfaceArea() {
  // TODO: Fill here and change return value if necessary.
   double side1 = getLength()*getWidth()*2;
   double side2 = getLength()*getHeight()*2;
   double side3 = getHeight()*getWidth()*2;
   double surfaceArea = side1+side2+side3;
  return surfaceArea;
 }

 /**
  * Computes the volume of the cuboid.
  * 
  * @return computed volume.
  */
 public double computeVolume() {
  // TODO: Fill here and change return value if necessary.
   double volume = getLength()*getWidth()*getHeight();
  return volume;
 }

 /**
  * Compute the weight. In case of density = 1, the weight is equal to volume
  * (in metric units).
  * 
  * @return weight for density = 1
  */
 public double computeWeight() {
  // TODO: Fill here and change return value if necessary.
   double weight = computeVolume();
  return weight;
 }

 /**
  * Method overload. Compute the weight. In case of density != 1, the weight
  * is equal to volume times density (in metric units).
  * 
  * @param density
  *            Cuboid density
  * @return computed weight for given density
  */
 public double computeWeight(double density) {
  // TODO: Fill here and change return value if necessary.
   double weight = computeVolume()*density;
  return weight;
 }

 /**
  * This will return all of Cuboid's information in a String format as
  * follow:
  * 
  * <pre>
  * Cuboid: length: _, width: _, height: _
  * </pre>
  * 
  * Where all the _ are to be filled by the Cuboid's corresponding info.
  * 
  * @return the Cuboid's information String.
  */
 public String toString() {
  // TODO: Fill here and change return value if necessary.
  // TODO: reuse methods already implemented.
  // TODO: Keyword. 
   String string = "Cuboid: length: " + getLength()+ ", width: " + getWidth()+ ", height: " + getHeight();
  return string;
 }
}