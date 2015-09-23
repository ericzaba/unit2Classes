

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class vendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    
    String name;
    int numberofSoda = 20;
    int numberofToken = 0;
    int numberofCans = 10;
    
    /**
     * Default constructor for objects of class vendingMachineTest
     */
    public vendingMachineTest()
    {
        String name;
        int numberofSoda;
        int numberofToken;
        
           }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void inputTokentest(){
        VendingMachine machine = new VendingMachine();

        machine.inputToken(10);
        assertEquals( 10.0, machine.getnumberofToken(), 1e-6);
        

    
    }
    @Test
    public void inputSodaTest(){
        VendingMachine machine = new VendingMachine();
        machine.inputSoda(10);
        assertEquals( 30.0, machine.getnumberofSoda(), 1e-6);
        
    
    }   
}
