
/**
 * Write a description of class numbers here.
 *
 * @author (connor)
 * @version (3/6/23)
 */
import java.util.Scanner;
public class CompareNumbers
{
   public static void main(String[] args)
   {
      float num1, num2; 
      String compare;
	Scanner keyboard = new Scanner(System.in);
  	
	System.out.print("Enter first number to compare: ");
                                  num1 = keyboard.nextFloat();

      System.out.print("Enter second number: ");
      num2 = keyboard.nextFloat();
		
      if (num1 < num2)
          compare = "number 2 is higher";
      else if (num1 > num2)
         compare = "number 1 is higher";
         
      else 
          compare = "both of the numbers are equal.";
          
   
         
      System.out.println( "After comparing the two numbers it was determined that, "
                        + compare);
   }
}
