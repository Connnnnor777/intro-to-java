public class BookDemo {
    public static void main(String[] args) {
        // Create a Book object using the no-argument constructor and populate it with set methods
        Book book1 = new Book();
        book1.setTitle("The Very Hungry Catepillar");
        book1.setAuthor("Eric Carle");
        book1.setPublisher("World Publishing Company ");

        // Create a Book object using the argument constructor
        Book book2 = new Book("Hop on Pop", "Dr Suess", "Random House");

        // Display the books' information
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Publisher: " + book1.getPublisher());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Publisher: " + book2.getPublisher());
    }
}
