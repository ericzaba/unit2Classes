

/**
 * Write a description of class vendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    public String name;
    public int numberofSoda;
    public int numberofToken;

    /**
     * Default constructor for objects of class vendingMachine
     */
    public vendingMachine()
    {
        String name = "Vending Machine";
        int numberofSoda = 100;
        int numberofToken = 0;
    }

    /**
     * Reduces the number of sodas for every 'token' inputted
     *
     * @pre        number of soda must be greater than 0
     *            (what the method assumes about the method's parameters and class's state)
     * @post    the number of sodas to be 1 less than before, unless zero
     * 
     * @return    number of soda
     */
    public void inputToken(int numberofSoda, int numberofToken)
    {
        numberofToken +=1;
        numberofSoda -= 1;
        
    }



    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void inputSoda(int numberofSoda)
    {
        numberofSoda +=1;

    }


}
