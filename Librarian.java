import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private int librarianId;
    private String name;

    private List<Book> managedBooks;

    public Librarian(int librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
        this.managedBooks = new ArrayList<>();
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        managedBooks.add(book);
    }

    public void removeBook(Book book) {
        managedBooks.remove(book);
    }

    public List<Book> getManagedBooks() {
        return managedBooks;
    }
}
