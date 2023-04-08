/**
 *        Connor 
 *        4/2/23
 *        
 *        BMI Calculator
 **/
import java.util.Scanner;  // Needed for the Scanner class

public class BMIcalc
{
    public static void main(float[] args)
   {
      
      float height; //person's height
      float weight; //   "     weight
      float BMI;
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the height.
      System.out.print("What is your height in inches? ");
      height = keyboard.nextFloat();
      
      
      // Get the weight.
      System.out.print("How much do you weight in pounds? ");
      weight = keyboard.nextFloat();
      
      //calculate the bmi
      BMI = weight * 703 / (height * height);
      
      // Display the resulting information.
      System.out.println("Hello" );
      System.out.println("Your BMI is " + String.format("%.1f", BMI));
      System.out.println("Which is considered " + getBMICategory(BMI));
      
    }
      
public static String getBMICategory(float BMI) {
        if (BMI < 18.5) {
            return "underweight";
        } else if (BMI < 25) {
            return "normal";
        } else if (BMI < 30) {
            return "overweight";
        } else {
            return "obese";
        }
      
      
    }
  
}
