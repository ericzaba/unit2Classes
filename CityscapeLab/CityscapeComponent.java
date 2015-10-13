import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @ezaba
 * @version 10 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    CityscapeViewer cityscape = new CityscapeViewer();
    int venture  = CityscapeViewer.venture;
    Background background = new Background(200, 600);
    Capsule capsule = new Capsule(100, 375);
    Capsule capsule1 = new Capsule(200, 375);
    Capsule capsule2 = new Capsule(300, 375);
    Capsule capsule3 = new Capsule(400, 375);
    Capsule capsule4 = new Capsule(500, 375);
    Sun sun = new Sun(25, 25);
    DomeHouse dome = new DomeHouse();
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        if (cityscape.venture == 1){
            background.draw(g2);
            capsule.drawSpaceX(g2);
            capsule1.drawSpaceX(g2);
            capsule2.drawSpaceX(g2);
            capsule3.drawSpaceX(g2);
            capsule4.drawSpaceX(g2);
            sun.draw(g2);
            dome.draw(g2);
        }
        
        if (cityscape.venture ==2){
            background.draw(g2);
            capsule.drawNasa(g2);
            capsule1.drawNasa(g2);
            capsule2.drawNasa(g2);
            capsule3.drawNasa(g2);
            capsule4.drawNasa(g2);
            sun.draw(g2);
            dome.draw(g2);
        
        }
        else{
            background.draw(g2);
            capsule.draw(g2);
            capsule1.draw(g2);
            capsule2.draw(g2);
            capsule3.draw(g2);
            capsule4.draw(g2);
            sun.draw(g2);
            dome.draw(g2);
        
        
        }
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        //sun.moveSun(g2);
        //-------------------
        //I couldnt get the animation method working properly because the graphics 2d is abstract and i didnt know how to put it here....
        //-------------------
        
        
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
