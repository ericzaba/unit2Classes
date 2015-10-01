import java.awt.Rectangle;
import java.util.Scanner;
public class RectanglePrinter
{
   public static void main(String[] args)
   {
      
      System.out.print("Enter the x input: ");
      
      Scanner sc = new Scanner(System.in);
      String scanx = sc.next();
      
      
      System.out.print("Enter the y input: ");
      String scany = sc.next();
      

      
      double xvalue= Integer.parseInt(scanx);
      double yvalue = Integer.parseInt(scany);
      double perimeter = xvalue*2 + yvalue*2;
      double a2b2 = Math.pow(xvalue, 2) + Math.pow(yvalue, 2);
      
      double diagonal = Math.sqrt(a2b2);
      
      double area = xvalue*yvalue;
      System.out.print("Perimeter: " + perimeter + "\n");
      System.out.print("Diagonal: " + diagonal + "\n");
      System.out.print("Area: " + area);
    }
}