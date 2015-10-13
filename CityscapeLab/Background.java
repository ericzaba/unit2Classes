import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Background
     */
    public Background(int x, int y)
    {
        
        
    }

    /**
     * Method that draws background with default values that cant be changed
     *
     * @pre n/a
     * @post 
     * @param graphics engine
     * @return n/a
     */
    public void draw(Graphics2D g2)
        
    {
        Color marsRed = new Color(180, 92, 56);
        Color marsSky = new Color(222, 184, 129);
        
        
        g2.setColor(marsRed);
        int x = 10;
        int y = 10;
        
        g2.drawRect(0, 400, 800, 200);
        g2.fillRect(0, 400, 800, 200);
        
        g2.setColor(marsSky);
        g2.drawRect(0, 0, 800, 400);
        g2.fillRect(0, 0, 800, 400);
    }

}
