
/**
 * Write a description of class sales tax here.
 *
* @author (Connor)
 * @version (2/4/23)
 */
public class SalesTax
{
    public static void main(String[]args)
    {
     
     double costinnj;
     double costinvineland;
     double costinpa;
     double costinnh;
     double costinca;
     
     float price;
     //--------------item price-----------//
     price=250;
     
     //tax rates//
     //New Jersy//
     final double njtaxrate;
     njtaxrate=.06625;
     
     //Vineland, NJ Cumberland County//
     //Portions of Vineland are part of the Urban Enterprise Zone.// 
     //These portions have a 3.3125% sales tax rate//
     final double vinelandtaxrate;
     vinelandtaxrate=.033125;
     
     //Pennsylvania//
     final double pataxrate;
     pataxrate=.06;
     
     //New Hampshire//
     final double nhtaxrate;
     nhtaxrate=.00;
     
     //California//
     final double cataxrate;
     cataxrate=.0725;
     
     //final cost after tax//
     costinnj=price + (njtaxrate * price);
     costinvineland=price + (vinelandtaxrate * price);
     costinpa=price + (pataxrate * price);
     costinnh=price + (nhtaxrate * price);
     costinca=price + (cataxrate * price);            
          
     System.out.printf("$"+"%.2f\n" , costinnj);
     System.out.printf("$" +"%.2f\n" , costinvineland);
     System.out.printf("$" +"%.2f\n" , costinpa);
     System.out.printf("$" +"%.2f\n" , costinnh);
     System.out.printf("$" +"%.2f\n" , costinca);

    }
   
   
}
