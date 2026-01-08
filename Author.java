import java.util.ArrayList;
import java.util.List;

public class Author {

    private int authorId;
    private String name;
    private String email;

    private List<Book> books;

    public Author(int authorId, String name, String email) {
        this.authorId = authorId;
        this.name = name;
        this.email = email;
        this.books = new ArrayList<>();
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
