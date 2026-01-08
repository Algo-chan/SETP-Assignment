import java.util.ArrayList;
import java.util.List;

public class Member {

    private int memberId;
    private String name;
    private String email;

    private List<Loan> loans;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.loans = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            Loan loan = new Loan(this, book);
            loans.add(loan);
            book.setAvailable(false);
        }
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.isActive()) {
                loan.closeLoan();
                book.setAvailable(true);
                break;
            }
        }
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
