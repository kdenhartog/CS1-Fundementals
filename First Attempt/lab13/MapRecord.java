/**
 * MapRecord.java
 * The encapsulation of a map record (a record in a map dataset).
 * 
 * @author Robert Cutler
 * 
 * @date November, 2012
 */
import javax.swing.JFrame;
import java.awt.Color;

public class MapRecord
{
  public double fromLongitude;
  public double fromLatitude;
  public double toLongitude;
  public double toLatitude;
  public String name; 
  public String type;
  public String fromAddressLeft;
  public String toAddressLeft;
  public String fromAddressRight;
  public String toAddressRight;
  public String zipLeft;
  public String zipRight;
  public String tractLeft;
  public String tractRight;
  public String blockLeft;
  public String blockRight;

  /**
   * provides a textual representation of the record
   * 
   * @return The textual representation of the record.
   */
  public String toString()
  {
    return 
      "--------------------------------------------------------------------------------" + "\n" +
      "Coordinates: (" + fromLongitude + "," + fromLatitude + ") --> (" + toLongitude + "," + toLatitude + ")" + "\n" +
      "Name: " + name + "\n" +
      "Type: " + type + "\n" +
      "Address range left: " + fromAddressLeft + "-" + toAddressLeft + "\n" +
      "Address range right: " + fromAddressRight + "-" + toAddressRight + "\n" +
      "Zip / Tract / Block (left): " + zipLeft + " / " + tractLeft + " / " + blockLeft + "\n" +
      "Zip / Tract / Block (right): " + zipRight + " / " + tractRight + " / " + blockRight + "\n";     
  }
  
  public void print()
  {
    System.out.println(this);
  }
  
  public void display(JFrame window, Color color)
  {
    if (window instanceof MapWindow)
      ((MapWindow) window).addMapRecord(this, color);
  }

  public boolean isIn(MapBounds bounds)
  {
    return bounds.contains(this.fromLongitude, this.fromLatitude) && bounds.contains(this.toLongitude, this.toLatitude);
  }
}