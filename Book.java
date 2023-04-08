/**
 * Book class
 */
public class Book extends BookDemo {

    private String title;
    private String author;
    private String publisher;

    /**
     * No-argument constructor
     */
    public Book() {
        this.title = "";
        this.author = "";
        this.publisher = "";
    }

    /**
     * Constructor with arguments
     */
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    /**
     * The setTitle method sets the title field.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The setAuthor method sets the author field.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * The setPublisher method sets the publisher field.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * The getTitle method returns the title field.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * The getAuthor method returns the author field.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * The getPublisher method returns the publisher field.
     */
    public String getPublisher() {
        return this.publisher;
    }
}

