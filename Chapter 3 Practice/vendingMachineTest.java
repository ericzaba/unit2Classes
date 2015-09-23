

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
    int numberofSoda = 10;
    int numberofToken = 1;
    int numberofCans = 1;
    
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
        vendingMachine machine = new vendingMachine();

        machine.inputToken(10, 10);

        machine.inputSoda(10);

    
    }
    @Test
    public void inputSodaTest(){
        vendingMachine machine = new vendingMachine();
        machine.inputSoda(10);
        System.out.println(numberofSoda);
    
    }   
}
