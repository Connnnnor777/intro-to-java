
/**
 * This program generates a numberlist using for loop
 *
 * @author (Connor )
 * @version (3/28/23)
 */
public class FORcount
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {

        // initialise instance variables
            int number;
        
            System.out.println("List of Numbers 1-10");
        
            for (number = 1; number <= 10; number++)
            {
                System.out.println(number + "\t\t" + number * number);
            }
    }
}
