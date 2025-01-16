public class LibraryManagementSystem {
    public static void main(String[] args) {
        ConsoleLogger logger = new ConsoleLogger();
        Library library = new Library((Logger) logger);

        try {
            library.addBook("7009", "Our non fairy tale life", "Ms. Rooprashi");
            library.addBook("6989", "It Ends with us", "Colleen Hoover");
            library.addBook("4556", "I Don't Love You Anymore", "Ritvik Singh");

            library.viewAvailableBooks();

            library.borrowBook("7009");
            library.viewAvailableBooks();

            library.returnBook("7009");
            library.viewAvailableBooks();

        } 
        catch (Exception e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}