/**
 *        Connor Bullock
 *        4/2/23
 *        
 *        BMI Calculator
 
 **/


import java.util.Scanner;  // Needed for the Scanner class

public class BMIcalc
{
    /**
     * aram args
     */
 public void main(float[] args)
   {
      
      float height; //person's height
      float weight; //   "     weight
      Float bmi;
      
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the height.
      System.out.print("What is your height in inches? ");
      height = keyboard.nextFloat();
      
      
      // Get the weight.
      System.out.print("How many much do you weight in pounds? ");
      weight = keyboard.nextFloat();
      
      //calculate the bmi
      BMI = weight * 703 / height * height;
      
           
      
      
      // Display the resulting information.
      System.out.println("Hello");
      System.out.println("Your BMI is considered " + BMI);
    }
  
}
