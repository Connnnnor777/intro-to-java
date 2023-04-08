
/**
 * Write a description of class shares here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;  // Needed for the Scanner class

/**
 *   This program demonstrates the Scanner class.
 */

    public class Payroll
{
   public static void main(int[] args)
   {
      double shares;         // number of shares 
      double price;           // share price
      double commission;      // broker percent
      double      subtotal; 
    double total;     // cost of stock purchase
      
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of shares.
      System.out.print("How many shares were purchased? ");
      shares = keyboard.nextInt();
      
      // Get the price they were purchased at.
      System.out.print("How much did each share cost? ");
      price = keyboard.nextDouble();
      
      // Get the broker's commission rate.
      System.out.print("What percentage does your broker charge? ");
      commission = keyboard.nextDouble();
      
      // Calculate the gross pay.
      subtotal = (shares * price);
      total = subtotal + (subtotal * commission);
      
      // Display the resulting information.
      System.out.println("Hello");
      System.out.println("Your investment return is $" + total);
   }
}
