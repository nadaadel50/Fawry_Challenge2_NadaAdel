# Quantum Bookstore

Welcome to **Quantum Bookstore** — an online bookstore system designed using **Java OOP principles**, showcasing a flexible and extensible architecture for managing different types of books and operations.

Quantum Bookstore supports an inventory of books with the following types:
- **PaperBook**: Has stock and can be shipped to an address.
- **EBook**: Has a file type and can be sent via email.
- **Showcase/DemoBook**: Display only; not for sale.
You can add many other types by extending from Book Class.

✨ **Features**

✅ Add books to inventory (ISBN, title, author, year, price)  
✅ Buy books:
   - Reduces stock for PaperBooks
   - Returns total paid amount  
✅ Remove outdated books older than a configurable number of years — **loops safely through all books**  
✅ Fully extensible design — add new book types without modifying core classes  

🧩 Extensibility
To add a new product type (e.g., AudioBook), simply:
Create a new class extending Book
Implement the buy logic as needed
Add it to inventory — no changes to BookStore needed!

![image](https://github.com/user-attachments/assets/1ae5ccac-8fb0-4463-a16d-2e0b5e92d340)
Here is the Main class to demonstrate all actions.

The output:
![image](https://github.com/user-attachments/assets/00a59b15-5de5-4dee-8099-88f3be17608b)

