public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN,String title, int yearPublished, double price, String author, int stock) {
        super(ISBN, title, yearPublished, price, author);
        this.stock = stock;
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if(stock < quantity){
            throw new Exception("Not enough stock for ISBN " + ISBN);
        }
        stock -= quantity;
        double amountPaid = price * quantity;
        System.out.println("Paper book bought. Paid amount: $" + amountPaid);
        // ShippingService.send(address); // not implemented
        System.out.println("ShippingService called for address: " + address);
    }

    public int getStock() { return stock; }
}
