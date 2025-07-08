public class ShowCase extends Book{

    public ShowCase(String ISBN,String title, int yearPublished, double price, String author) {
        super(ISBN, title, yearPublished, price, author);
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        throw new Exception("Showcase book is not for sale.");
    }
}
