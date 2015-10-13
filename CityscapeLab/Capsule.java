import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 * Write a description of class Building here.
 * 
 * @author (ericzaba) 
 * @version (10/12/2016)
 */
public class Capsule
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft; //The x axis coordinate of the top left corner
    
    private int yTop; //the y axis coordinate of the top left corner
    
    public Capsule(int x, int y)
    {
        xLeft = x;
        yTop = y;
        
        
        
    }
    /**
     * draws generic capsules for failed user input
     *
     * @pre n/a
     * @post 
     * @param graphics engine
     * @return n/a
     */
    public void draw(Graphics2D g2){
        
        g2.setColor(Color.white);
        
        g2.drawRect(xLeft, yTop, 50, 30);
        g2.fillRect(xLeft, yTop, 50, 30);

        g2.fillArc(xLeft, yTop-25, 50, 50, 90, -90);
        g2.fillArc(xLeft, yTop-25, 50, 50, 90, 90);
        g2.setColor(Color.gray);
        g2.fillRect(xLeft, yTop+30, 10, 10);
        g2.fillRect(xLeft+21, yTop+30, 10, 10);
        g2.fillRect(xLeft+42, yTop+30, 10, 10);
        g2.setColor(Color.blue);
        g2.fillRect(xLeft+18, yTop-15, 15, 15);
        g2.fillRect(xLeft+6, yTop-12, 5, 10);
        g2.fillRect(xLeft+40, yTop-12, 5, 10);
        
    }
    /**
     * Method that draws capsules with spaceX logo
     *
     * @pre n/a
     * @post 
     * @param graphics engine
     * @return n/a
     */
    public void drawSpaceX(Graphics2D g2){
        g2.setColor(Color.white);
        
        g2.drawRect(xLeft, yTop, 50, 30);
        g2.fillRect(xLeft, yTop, 50, 30);

        g2.fillArc(xLeft, yTop-25, 50, 50, 90, -90);
        g2.fillArc(xLeft, yTop-25, 50, 50, 90, 90);
        g2.setColor(Color.gray);
        g2.fillRect(xLeft, yTop+30, 10, 10);
        g2.fillRect(xLeft+21, yTop+30, 10, 10);
        g2.fillRect(xLeft+42, yTop+30, 10, 10);
        g2.setColor(Color.blue);
        g2.fillRect(xLeft+18, yTop-15, 15, 15);
        g2.fillRect(xLeft+6, yTop-12, 5, 10);
        g2.fillRect(xLeft+40, yTop-12, 5, 10);
        
        try {
                
                BufferedImage spaceXimage = ImageIO.read(new File("spacex.png"));
                g2.drawImage(spaceXimage, xLeft, yTop, null);
            } catch (IOException e) {
                System.out.println("the image load didnt work!");
            }
    }
    /**
     * Method that draws capsules with nasa logo
     *
     * @pre graphics engine must be imported, xleft and ytop must be set to at least defaults
     * @post n/a
     * @param graphics 2d engine
     * @return n/a
     */
    public void drawNasa(Graphics2D g2){
        g2.setColor(Color.white);
        
        g2.drawRect(xLeft, yTop, 50, 30);
        g2.fillRect(xLeft, yTop, 50, 30);

        g2.fillArc(xLeft, yTop-25, 50, 50, 90, -90);
        g2.fillArc(xLeft, yTop-25, 50, 50, 90, 90);
        g2.setColor(Color.gray);
        g2.fillRect(xLeft, yTop+30, 10, 10);
        g2.fillRect(xLeft+21, yTop+30, 10, 10);
        g2.fillRect(xLeft+42, yTop+30, 10, 10);
        g2.setColor(Color.blue);
        g2.fillRect(xLeft+18, yTop-15, 15, 15);
        g2.fillRect(xLeft+6, yTop-12, 5, 10);
        g2.fillRect(xLeft+40, yTop-12, 5, 10);
        
        try {
                
                BufferedImage nasaimage = ImageIO.read(new File("nasa.png"));
                g2.drawImage(nasaimage, xLeft, yTop, null);
            } catch (IOException e) {
                System.out.println("the image load didnt work!");
            }
        
        
    }


}
