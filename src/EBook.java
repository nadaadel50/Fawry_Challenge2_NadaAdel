public class EBook extends Book{
    private String fileType;

    public EBook(String ISBN,String title, int yearPublished, double price, String author, String fileType) {
        super(ISBN, title, yearPublished, price, author);
        this.fileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) throws Exception {
        if (quantity != 1) {
            throw new Exception("Only one copy of EBook can be bought at a time.");
        }
        double amountPaid = price;
        System.out.println("EBook bought. Paid amount: $" + amountPaid);
        // MailService.send(email); // not implemented
        System.out.println("MailService called for email: " + email);
    }
}
