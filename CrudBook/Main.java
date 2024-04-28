public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();

     
        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Python for Beginners", "Jane Smith"));
        library.addBook(new Book(3, "C# Essentials", "David Brown"));

       
        System.out.println("All Books:");
        for (Book book : library.getAllBooks()) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        
        library.updateBook(2, "Python Programming", "Jane Smith");

        
        System.out.println("\nUpdated Book:");
        Book updatedBook = library.getBookById(2);
        System.out.println("ID: " + updatedBook.getId() + ", Title: " + updatedBook.getTitle() + ", Author: " + updatedBook.getAuthor());

      
        library.deleteBook(1);



       
       
    }
}
