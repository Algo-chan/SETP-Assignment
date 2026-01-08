import java.util.ArrayList;
import java.util.List;

public class Book {

    private int bookId;
    private String title;
    private String isbn;
    private boolean available;

    private List<Author> authors;

    public Book(int bookId, String title, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.available = true;
        this.authors = new ArrayList<>();
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
