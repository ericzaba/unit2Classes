import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @ezaba
 * @version 10 October 2015
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;

    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static int venture;
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800, 600);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which Venture? (SpaceX [1], NASA[2]):");
        int venture = scanner.nextInt();
        
        
        
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
        
        
    }
    /**
     * getter method for the variable inside main method
     *
     * @pre venture variable must be changed
     * @post n/a
     * @param n/a
     * @return the value of venture after being changed by scanner
     */
    public int getVenture(){
            return CityscapeViewer.venture;
            
        }
    

}
