import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Write a description of class DomeHouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DomeHouse
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class DomeHouse
     */
    public DomeHouse()
    {
        this.xLeft = 575;
        this.yTop = 400;
    }

    
    /**
     * Method that draws dome without change
     *
     * @pre n/a
     * @post 
     * @param graphics engine
     * @return n/a
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.gray);
        g2.fillRect(xLeft, yTop, 200, 20);
        g2.setColor(Color.blue);
        g2.drawArc(xLeft, yTop-75, 200, 150, 90, 90);
        g2.drawArc(xLeft-2, yTop-75, 200, 150, 90, -90);
        
        
        
    }
}
