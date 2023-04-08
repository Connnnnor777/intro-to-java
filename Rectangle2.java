/**
 * book class
 */

public class Book;{

   title = "";
   author = "";
   publisher = "";
}
   /**
    * Constructor
    */

    public Book(String title, String author, String publisher) {
      this.title = title;
      this.author = author;
      this.publisher = publisher;
  }

   /**
    * The settitle method accepts an argument
    * that is stored in the title field. 
    */

   public void settitle(String title)
   {
      title = title;
   }

   /**
    * The setWidth method accepts an argument
    * that is stored in the width field.
    */

   public void setauthor(String w)
   {
      author = author;
   }

   /**
    * The set method accepts two arguments
    * that are stored in the title and width
    * fields.
    */

   public void set(String title, String author, String publisher)
   {
      title = title;
      author = author;
   }

   /**
    * The gettitle method returns the value
    * stored in the title field.
    */

   public String gettitle()
   {
      return title;
   }

   /**
    * The getWidth method returns the value
    * stored in the width field.
    */

   public String getauthor()
   {
      return author;
   }

   /**
    * The getArea method returns the value of the
    * title field times the width field.
    */

   public String getpublisher()
   {
      return publisher;
   }
