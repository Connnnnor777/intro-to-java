/**
 * book class
 */

public class Book()
{

   title = "";
   author = "";
   publisher = "";
}
   /**
    * Constructor
    */

   public Book(double title, double w)
   {
      title = title;
      width = w;
   }

   /**
    * The settitle method accepts an argument
    * that is stored in the title field. 
    */

   public void settitle(double title)
   {
      title = title;
   }

   /**
    * The setWidth method accepts an argument
    * that is stored in the width field.
    */

   public void setWidth(double w)
   {
      width = w;
   }

   /**
    * The set method accepts two arguments
    * that are stored in the title and width
    * fields.
    */

   public void set(double title, double w)
   {
      title = title;
      width = w;
   }

   /**
    * The gettitle method returns the value
    * stored in the title field.
    */

   public double gettitle()
   {
      return title;
   }

   /**
    * The getWidth method returns the value
    * stored in the width field.
    */

   public double getWidth()
   {
      return width;
   }

   /**
    * The getArea method returns the value of the
    * title field times the width field.
    */

   public double getArea()
   {
      return title * width;
   }
}
