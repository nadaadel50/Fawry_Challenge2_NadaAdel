
public class Main {
    public static void main(String[] args) throws Exception {
        BookStore bookStore = new BookStore();

        // Adding Books
        Book paperBook1 = new PaperBook("ISBN 1", "Python Basics", 2024, 30.00, "John Doe", 5);
        bookStore.addBook(paperBook1);

        Book eBook1 = new EBook("ISBN 2", "JavaScript", 2002, 50.00, "liam Won", "PDF");
        bookStore.addBook(eBook1);

        Book showCaseBook = new ShowCase("ISBN 3", "Advanced Algorithms", 1985, 0.00, "Stephany William");
        bookStore.addBook(showCaseBook);

        // Buying Books
        // If quantity more than stock it will throw an error.
        bookStore.buyBook("ISBN 1", 2, "dew.sara2004@gmail.com", "Giza, FirstGate 17A");

        // If we make quantity more than 1 will throw an error as it's Ebook.
        bookStore.buyBook("ISBN 2", 1, "dew.sara2004@gmail.com", null);

        // This will throw error because this is a showCase book. It is not for sale.
        //bookStore.buyBook("ISBN 3", 2, "dew.sara2004@gmail.com", "Giza, FirstGate 17A");

        // Removing Books
        bookStore.removeOutDatedBook( 5);

        bookStore.removeBook("ISBN 1");



    }
}
