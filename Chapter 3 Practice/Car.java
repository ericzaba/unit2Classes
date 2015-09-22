
/**
 * The class car has a certain fuel efficiency and a certain amount of fuel in the gas tank. A car may be driven a specified distance which reduces the amount of gas in the ta;nk.
 * @author (Eric Zaba) 
 * @version (Sept 10 2015)
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    /** Specifies the fuel efficiency of the car, in unites of miles per gallon() mpg) */
    private double fuelEfficiency;

    /** Specifies the amount of fuel in the gas tank in unites of gallons*/

    private double fuelInTank;
    private int x;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of the car.
     */
    public Car(double fuelEfficiency)
    {
        this.fuelInTank = 0.0;
        this.fuelEfficiency = fuelEfficiency

    }

    /**
     * simulates driving the car the specified distance in miles and reduces the amount of fuel in the car's tank
     * @pre the specified distance cannot consume more than the fuel availbable in the tank
     * @param distance the specified distance the car goes
     */
    public void drive( double distance )
    {

        fuelInTank -= distance / fuelEfficiency;

    }

    /**
     * returns the number of gallons of gas in the car's tank.
     */
    public double getGasInTank()
    {

        return fuelInTank;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre   gallons of gas mujst be positive
     * @param amount in gallons to increment the fuel in the car's tank
     * 

     */
    public void addGas( double gallonsOfGas )
    {
        fuelInTank += gallonsOfGas;
    }

}
