
public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int yearPublished;
    protected double price;
    protected String author;

    public Book(String ISBN, String title, int yearPublished, double price, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }

    public abstract void buy(int quantity, String email, String address) throws Exception;
}
