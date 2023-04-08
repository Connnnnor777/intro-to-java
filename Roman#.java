import java.util.Scanner;

/**
 *      Connor  3/27/23
 *      
 *      This program converts whole numbers between 1 and 10 to Roman numerals
 *  if a number outside of that range is entered the user recieves an error message.
 */
 
public class Roman
{
   public static void main(String[] args)
   {
      String input;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a number from the user.
      System.out.print("Enter a number 1 thru 10: ");
      input = keyboard.nextLine();
      
      // Translate the number to Roman Numeral.
      switch (input)
      {
         case "1":
            System.out.println("I");
            break;
         case "2":
            System.out.println("II");
            break;
         case "3":
            System.out.println("III");
            break;
         case "4":
            System.out.println("IV");
            break;
         case "5":
            System.out.println("V");
            break;
         case "6":
            System.out.println("VI");
            break;
         case "7":
            System.out.println("VII");
            break;
         case "8":
            System.out.println("VIII");
            break;
         case "9":
            System.out.println("IX");
            break;
         case "10":
            System.out.println("X");
            break;
         default:
            System.out.println("ERROR: Please enter a whole number 1-10 only");
      }
   }
}
