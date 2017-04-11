import java.awt.*;
import javax.swing.*;

public class bullseye extends JApplet {
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(50,50,400,400);
        g.setColor(Color.WHITE);
        g.fillOval(100,100,300,300);
        g.setColor(Color.RED);
        g.fillOval(150,150,200,200);
        g.setColor(Color.WHITE);
        g.fillOval(200,200,100,100);
        g.setColor(Color.RED);
        g.fillOval(225,225,50,50);
        g.setColor(Color.BLACK);
        g.drawLine(0,0,500,500);
        g.drawLine(500,0,0,500);
    }
}