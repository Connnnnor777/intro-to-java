/**
 * CopyofBook class
 */

   /**
    * No-argument constructor
    */
public CopyofBook() {
      this.title = "";
      this.author = "";
      this.publisher = "";
   }

   /**
    * Constructor with arguments
    */
   public CopyofBook(String title, String author, String publisher) {
      this.title = title;
      this.author = author;
      this.publisher = publisher;
   }

   /**
    * The setTitle method accepts an argument
    * that is stored in the title field. 
    */
   public void setTitle(String title) {
      this.title = title;
   }

   /**
    * The setAuthor method accepts an argument
    * that is stored in the author field.
    */
   public void setAuthor(String author) {
      this.author = author;
   }

   /**
    * The setPublisher method accepts an argument
    * that is stored in the publisher field.
    */
   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   /**
    * The getTitle method returns the value
    * stored in the title field.
    */
   public String getTitle() {
      return title;
   }

   /**
    * The getAuthor method returns the value
    * stored in the author field.
    */
   public String getAuthor() {
      return author;
   }

   /**
    * The getPublisher method returns the value
    * stored in the publisher field.
    */
   public String getPublisher() {
      return publisher;
   }
   /**
 * Demo class for Book
 */

public class Demo {
   public static void main(String[] args) {

      // Create a Book object using the no-argument constructor
      Book book1 = new Book();

      // Populate the book information using set methods
      book1.setTitle("Harry Potter and the Philosopher's Stone");
      book1.setAuthor("J.K. Rowling");
      book1.setPublisher("Bloomsbury Publishing");

      // Create another Book object using the constructor with arguments
      Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin");

      // Display the books' information
      System.out.println("Book 1:");
      System.out.println("Title: " + book1.getTitle());
      System.out.println("Author: " + book1.getAuthor());
      System.out.println("Publisher: " + book1.getPublisher());

      System.out.println();

      System.out.println("Book 2:");
      System.out.println("Title: " + book2.getTitle());
      System.out.println("Author: " + book2.getAuthor());
      System.out.println("Publisher: " + book2.getPublisher());
    
}

