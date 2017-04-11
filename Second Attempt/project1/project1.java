/* @author Kyle Den Hartog
 * program name: project1.java
 * completed: 9/14/14
 * draws a picture of two trees in the nighttime
 */

import java.awt.*;
import javax.swing.*;

public class project1 extends JApplet{

    
    public void paint(Graphics g){
        Color brown,darkGreen;
        brown = new Color(139,115,85);
        darkGreen = new Color(0,100,0);
        
        g.setColor(Color.BLACK);
        g.fillRect(0,0,500,500); //draws background color to black
        g.setColor(Color.GREEN);
        g.fillRect(0,400,500,100);//draws grass on ground
        g.setColor(brown);
        g.fillRect(125,250,50,150); // draws left tree trunk
        g.fillRect(375,250,50,150); //draws right tree trunk
        g.setColor(darkGreen);
        g.fillPolygon(drawTriangleX(75),drawTriangleY(275),3); /*draws triangle for left tree*/
        g.fillPolygon(drawTriangleX(75),drawTriangleY(225),3); /*draws another triangle left tree*/
        g.fillPolygon(drawTriangleX(325),drawTriangleY(275),3); /*draws triangle for right tree*/
        g.fillPolygon(drawTriangleX(325),drawTriangleY(225),3); /*draws another triangle for right tree*/
        g.setColor(Color.YELLOW);
        g.fillOval(0,0,75,75); // draws first part of moon
        g.setColor(Color.BLACK);
        g.fillOval(25,25,75,75); // turns it to a cresent
    }//closes paint method
    
    /**
     * Method drawTriangleX
     *
     * @param startCordX: the starting X coordinate to find other points
     * @return int[] of x coordinates
     */
    public int[] drawTriangleX(int startCordX){ 
        int[] cord = new int [3];
        cord[0] = startCordX;
        cord[1] = startCordX + 150;
        cord[2] = startCordX + 75;
        
        return cord;
    } //closes drawTriangleX method
    
    /**
     * Method drawTriangleY
     *
     * @param startCordY the starting Y cordinate to find other points
     * @return int[] of Y values
     */
    public int[] drawTriangleY(int startCordY){ /*method to make an array for y cord of triangle*/
        int[] cord = new int [3];
        cord[0] = startCordY;
        cord[1] = startCordY;
        cord[2] = startCordY - 100;
        
        return cord;
    } //closes drawTriangleY method
}//closes class