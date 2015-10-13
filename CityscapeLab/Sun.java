
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft = 25;
    private int yTop = 25;
    
    private int sunSize = 100;
    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y)
    {
        x =xLeft;
        y = yTop;
        this.sunSize = 50;
    }

   /**
     * draw method that draws the sun in its inital position
     *
     * @pre n/a
     * @post n/a
     * @param the garphics engine
     * @return n/a
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.white);
        g2.fillOval(xLeft, yTop, sunSize, sunSize);
    }
    /**
     * move sun method, moves sun across sky until there is no more 
     *
     * @pre Graphics must be imported and available
     * @post n/a
     * @param the graphics engine
     * @return n/a
     */
    public void moveSun(Graphics2D g2)
    {
        for (int i=1; i<600; i++){
            g2.setColor(Color.white);
            g2.fillOval(xLeft+i, yTop, sunSize, sunSize);
        
        }
    }

}
