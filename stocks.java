import java.util.Scanner;

public class stocks {
    public static void main(String[] args) {
        double shares;         // number of shares
        double price;          // share price
        double commission;     // broker percent
        double subtotal;
        double total;          // cost of stock purchase
        double sellprice;
        double brokerfee;
        double sellsubtot;
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of shares.
        System.out.print("How many shares were purchased? ");
        shares = keyboard.nextDouble();

        // Get the price they were purchased at.
        System.out.print("How much did each share cost when purchased? ");
        price = keyboard.nextDouble();

        // Get the broker's commission rate.
        System.out.print("What percentage does your broker charge? ");
        commission = keyboard.nextDouble();
        
        //sold number
        System.out.print("How many shares were sold? ");
        shares = keyboard.nextDouble();
        
        //sale price
        System.out.print("How much did each share sell for? ");
        sellprice = keyboard.nextDouble();


        // Calculate the totals.
        subtotal = (shares * price);
        brokerfee = commission * subtotal;
        total = subtotal + brokerfee;
        sellsubtot = shares * sellprice;
        
        
        

        // Display the resulting information.
        System.out.println("Hello Joe ");
        System.out.println("Thecost of this investment is $" + total);
        System.out.println("You paid $" + (subtotal * commission) + " in commission to your broker when purchasing the shares");
        System.out.println("Your stock sold for $" + sellsubtot);
        System.out.println("You paid $" + (sellsubtot * commission) + " in commission to your broker when selling your stock");
        System.out.println("Profits are $" + ((total + commission) - (sellsubtot + commission)));
    
    }

}
