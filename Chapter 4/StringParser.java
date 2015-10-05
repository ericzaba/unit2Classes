
import java.util.Scanner;
/**
 * Write a description of class StringParser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringParser
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1,000 and 999,999: ");
        String input = scanner.next();
        

        
        try{
            String outputString = input.replace("," , "");
            
            int answer = Integer.parseInt(outputString);
            
            System.out.print("input without comma: " + answer);
            
        
        }
        catch(Exception e){
            System.out.print("Sorry, please enter a valid value wiht a comma");
        }
    }
}
