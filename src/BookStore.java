import java.util.*;

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book){
        inventory.put(book.getISBN(), book);
        System.out.println("Book added to the book store: " + book.getISBN());
    }

    public void removeBook(String ISBN){
        Book removed = inventory.remove(ISBN);
        if(removed != null){
            System.out.println("Book removed from the book store: " + ISBN);
        }
        else{
            System.out.println("Book not found in the book store: " + ISBN);
        }
    }

    public List<Book> removeOutDatedBook(int maxYears) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Book> booksToRemove = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();

            if (currentYear - book.getYearPublished() > maxYears) {
                booksToRemove.add(book);
                iterator.remove();
                System.out.println("Outdated Book removed from the book store: " + book.getISBN());
            }
        }

        if (booksToRemove.isEmpty()) {
            System.out.println("No outdated books found in the inventory.");
        }

        return booksToRemove;
    }

    public void buyBook(String ISBN, int quantity, String email, String address) throws Exception {
        Book book = inventory.get(ISBN);
        if(book == null){
            throw new Exception("Book not found in the book store: " + ISBN);
        }
        book.buy(quantity, email, address);
    }



}
