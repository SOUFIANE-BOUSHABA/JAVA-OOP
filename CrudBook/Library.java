import java.util.ArrayList;
import java.util.List;
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                break;
            }
        }
    }
    public void updateBook(int id, String title, String author) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(title);
                book.setAuthor(author);
                break;
            }

        }
    }


}