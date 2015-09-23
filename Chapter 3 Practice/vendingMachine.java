

/**
 * Write a description of class vendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    public String name; //name ofr reference
    public int numberofSoda; //numbero of soda filled cans
    public int numberofToken; //number of tokens in machine
    public int numberofCans; //number of cans to be inputted to machine
    /**
     * Default constructor for objects of class vendingMachine
     */
    public VendingMachine()
    {
        String name = "Vending Machine";
        int numberofSoda = 100;
        int numberofToken = 1;
        int numberofCans = 1;
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
    public void inputToken(int numberofToken)
    {
        numberofToken +=numberofToken;
        numberofSoda -= numberofToken;
        
    }




    public void inputSoda(int numberofCans)
    {
        numberofSoda +=numberofCans;

    }
    public int getnumberofSoda(){
        return numberofSoda;
    
    }
    public int getnumberofToken(){
        return numberofToken;
    }


}
