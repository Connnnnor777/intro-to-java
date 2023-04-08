
/**
 * Write a description of class TestScores here.
 *
 * @author (Connor)
 * @version (2/4/23)
 */

import java.util.Scanner;  // Needed for the Scanner class

/**
 *   This program demonstrates the Scanner class.
 */

public class TestScoreAverage
{
   public static void main(String[] args)
   {
      String name;         // To hold a name
      int tests;           // tests taken
      double test1,      // test scores
             test2,
             test3;     
      double average;    //avg score
      
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      //who are you
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      // Get the number of tests taken
      System.out.print("How many tests have you taken? ");
      tests = keyboard.nextInt();
      
      // Get the person's scores
      System.out.print("What was the score ");
      test1 = keyboard.nextDouble();
      
      System.out.print("What was the score ");
      test2 = keyboard.nextDouble();
      
      System.out.print("What was the score ");
      test3 = keyboard.nextDouble();
      
      // Calculate the average score.
      average = (test1 + test2 + test3) / tests ;
      
      // Display the resulting information.
      System.out.printf(name + ", your average score is: " + average);
   }
}
