import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private Logger logger;

    public Library(Logger logger2) {
        this.books = new ArrayList<>();
        this.logger = logger2;
    }

    public void addBook(String bookId, String title, String author) throws Exception {
        if (bookId == null || bookId.isEmpty() || title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new Exception("Invalid book details.");
        }
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                throw new Exception("Book ID must be unique.");
            }
        }
        Book newBook = new Book(bookId, title, author);
        books.add(newBook);
        logger.log("Added book: " + newBook);
    }

    public void borrowBook(String bookId) throws Exception {
        Book book = findBookById(bookId);
        if (book == null) {
            throw new Exception("Book not found.");
        }
        if (!book.isAvailable()) {
            throw new Exception("Book is not available for borrowing.");
        }
        book.setAvailable(false);
        logger.log("Borrowed book: " + book);
    }

    public void returnBook(String bookId) throws Exception {
        Book book = findBookById(bookId);
        if (book == null) {
            throw new Exception("Book not found.");
        }
        if (book.isAvailable()) {
            throw new Exception("This book was not borrowed.");
        }
        book.setAvailable(true);
        logger.log("Returned book: " + book);
    }

    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
}